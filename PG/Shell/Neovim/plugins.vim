" =============================================================================
" Filename: ~/.config/nvim/plugins.vim
" Author: s20016
" Last Change: Tue Dec  7 11:30:33 JST 2021
" =============================================================================

" netrw file browser
let g:netrw_banner = 0
let g:netrw_liststyle = 3
let g:netrw_browse_split = 3
let g:netrw_winsize = 15

" PLUGIN: Themes
colorscheme onedark

" PLUGIN: vim-commentary
autocmd FileType apache setlocal commentstring=#\ %s

" ==== SNIPPETS ================================================================
" custom snippet directory
let g:UltiSnipsSnippetDirectories=["UltiSnips", $HOME.'/.config/nvim/UltiSnips']
let g:UltiSnipsExpandTrigger="<tab>"
let g:UltiSnipsListSnippets="<c-l>"

" ==== STARTIFY ===============================================================

" PLUGIN: Startify
let g:webdevicons_enable_startify = 1
let g:startify_change_to_dir = 0
let g:startify_enable_special = 0
let g:startify_files_number = 10
let g:startify_session_dir = '~/.config/nvim/session'
let g:startify_lists = [
			\ { 'type': 'sessions',  'header': ['   Sessions' ] },
			\ { 'type': 'files',     'header': ['   FILES'    ] },
			\ { 'type': 'commands',  'header': ['   Commands' ] },
			\ { 'type': 'bookmarks', 'header': ['   Bookmarks'] }, ]

let g:startify_bookmarks = [
		  \	{ '-': '~/Documents/Clone/FILES/MyGit' } ]

let g:startify_custom_header = [
			\ '    ____  ____   ___      _ _____ ____ _____ ____   ',
			\ '   |  _ \|  _ \ / _ \    | | ____/ ___|_   _/ ___|  ',
			\ '   | |_) | |_) | | | |_  | |  _|| |     | | \___ \  ',
			\ '   |  __/|  _ <| |_| | |_| | |__| |___  | |  ___) | ',
			\ '   |_|   |_| \_\\___/ \___/|_____\____| |_| |____/  ',
			\ '' ]

" ==== ERROR & WARNING ========================================================

" PLUGIN: Ale_linters
let g:ale_echo_msg_error_str = 'E'
let g:ale_echo_msg_warning_str = 'W'
let g:ale_echo_msg_format = '[%linter%] %s [%severity%]'
let g:ale_sign_error = ''
let g:ale_sign_warning = ''
let g:ale_lint_on_save = 1
let g:ale_fix_on_save = 1
let g:ale_completion_enabled = 1

let g:ale_linters = {
			\ 'javascript': ['standard'],
			\ 'python'    : ['flake8']
			\ }

let g:ale_fixers = {
			\ 'javascript': ['prettier-standard', 'eslint'],
			\ 'html'      : ['prettier'],
			\ 'python'    : ['autopep8', 'black', 'isort']
			\ }

highlight Normal       guibg=none
highlight Visual       guibg=#585858
highlight SignColumn   guibg=none guifg=#444444
highlight LineNr       guibg=none guifg=#444444

" highlight CursorLine   
highlight CursorColumn guibg=none guifg=none
highlight CursorLineNR guibg=#444444 guifg=#808080

" ==== STATUS LINE ============================================================
" See `:h g:lightline.component` for details
" See `:h g:lightline.colorscheme` for available colorscheme

let g:lightline = {
	\ 'colorscheme': 'onedark',
	\ 'active': {
	\ 'left': [
	\		[ 'mode', 'paste' ],
	\   [ 'gitbranch' ],
	\   [ 'readonly', 'filename', 'modified' ] ],
	\ 'right': [
	\   [ 'lineinfo' ], [ 'percent' ], [ 'filetype' ] ] },
	\ 'component_function': {
  \   'gitbranch': 'FugitiveHead', 
  \   'lineinfo': 'LightlineLineinfo' },
	\ 'tab': {
	\  'active': [ 'filename', 'modified' ],
	\  'inactive': [ 'tabnum' ]
	\ } }

" Highlight active window color
function! LightlineLineinfo() abort
	if winwidth(0) < 50
		return ''
	endif
	let l:current_line = printf('%-3s', line('.'))
	let l:max_line = printf('%-3s', line('$'))
	let l:lineinfo = '' . l:current_line . '/' . l:max_line
	return l:lineinfo
endfunction

" Tab separator
let g:lightline.separator = { 'left': '', 'right': '' }
let g:lightline.subseparator = { 'left': '', 'right': '' }

lua << EOF
	local lsp_installer = require("nvim-lsp-installer")
	local lspkind = require "lspkind"
	local cmp = require "cmp"
	lspkind.init()

	require'colorizer'.setup()

	require'nvim-treesitter.configs'.setup {
		ensure_installed = "maintained",
		sync_install = false,
		ignore_install = { "javascript" },
		highlight = {
			enable = true,
			disable = {},
			additional_vim_regex_highlighting = false,
		},
	}

  -- CMP Config
	cmp.setup({
		snippet = {
			expand = function(args)
				vim.fn["UltiSnips#Anon"](args.body)
			end,
		},

		mapping = {
			["<C-d>"] = cmp.mapping.scroll_docs(-4),
			["<C-f>"] = cmp.mapping.scroll_docs(4),
			["<C-e>"] = cmp.mapping.close(),
			["<c-y>"] = cmp.mapping(
				cmp.mapping.confirm {
					behavior = cmp.ConfirmBehavior.Insert,
					select = true,
				},
				{ "i", "c" }
			),

			["<c-space>"] = cmp.mapping {
				i = cmp.mapping.complete(),
				c = function(
					_
				)
					if cmp.visible() then
						if not cmp.confirm { select = true } then
							return
						end
					else
						cmp.complete()
					end
				end,
			},
		},

		formatting = {
			format = lspkind.cmp_format {
				with_text = true,
				menu = {
					buffer = "[BUF]",
					nvim_lsp = "[LSP]",
					path = "[PATH]",
					ultisnips	= "[SNIP]",
				},
			},
		},

		experimental = {
			native_menu = false,
			ghost_text = true
		},

		sources = cmp.config.sources({
			{ name = 'nvim_lsp' },
			{ name = 'ultisnips' }, 
		}, {
			{ name = 'buffer', keyword_length = 4 },
		})
	})

	cmp.setup.cmdline('/', {
		sources = {
			{ name = 'buffer' }
		}
	})

	require'cmp'.setup.cmdline('/', {
		sources = {
			{ name = 'buffer' }
		}
	})

	local capabilities = require('cmp_nvim_lsp').update_capabilities(vim.lsp.protocol.make_client_capabilities())

	require('lspconfig')['pyright'].setup {
		capabilities = capabilities
	}
EOF

