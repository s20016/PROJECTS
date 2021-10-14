" =============================================================================
" Filename: ~/.config/nvim/plugins.vim
" Author: s20016
" Last Change: Sun May 23 12:08:58 JST 2021
" =============================================================================

" netrw file browser
let g:netrw_banner = 0
let g:netrw_liststyle = 3
let g:netrw_browse_split = 3
let g:netrw_winsize = 15

" PLUGIN: Themes
let g:gruvbox_italic=1
colorscheme gruvbox

" PLUGIN: vim-commentary
autocmd FileType apache setlocal commentstring=#\ %s

" PLUGIN: colorizer.lua
lua require'colorizer'.setup()

" PLUGIN: Neovim Session
let g:session_directory = "~/.config/nvim/session"
let g:session_command_aliases = 1
let g:session_autoload = "no"
let g:session_autosave = "no"

" PLUGIN: FZF (Open below)
" let g:fzf_layout = { 'down': '~40%' }

" ==== STARTIFY ===============================================================

" PLUGIN: Startify
let g:startify_change_to_dir = 0
let g:startify_files_number = 5
let g:startify_session_dir = '~/.config/nvim/session'
let g:startify_lists = [
			\ { 'type': 'sessions',  'header': ['   Sessions']  },
			\ { 'type': 'bookmarks', 'header': ['   Bookmarks'] }, ]

let g:startify_bookmarks = [
			\ { 'a': '~/.bash_aliases' } ]

" let g:startify_custom_header = [
" 	\ '',
" 	\ '   NVIM STARTIFY' ]

let g:startify_custom_header = [
			\ '    ____  ____   ___      _ _____ ____ _____ ____   ',
			\ '   |  _ \|  _ \ / _ \    | | ____/ ___|_   _/ ___|  ',
			\ '   | |_) | |_) | | | |_  | |  _|| |     | | \___ \  ',
			\ '   |  __/|  _ <| |_| | |_| | |__| |___  | |  ___) | ',
			\ '   |_|   |_| \_\\___/ \___/|_____\____| |_| |____/  ',
			\ '' ]

" ==== ERROR & WARNING ========================================================

" PLUGIN: Ale_linters
let g:ale_lint_on_save = 1
let g:ale_fix_on_save = 1
let g:ale_sign_error = '>'
let g:ale_sign_warning = '>'
let g:ale_linters = {'python': [ 'flake8' ]}
let g:ale_fixers = {'python': [ 'autopep8', 'black', 'isort' ]}

highlight ALEErrorSign    guifg=#db4437 ctermfg=203
highlight ALEWarningSign  guifg=#f4b400 ctermfg=228

" PLUGIN: Git gutter
let g:gitgutter_async=0
let g:gitgutter_sign_added = '+'
let g:gitgutter_sign_modified = '~'
let g:gitgutter_sign_removed = 'x'
let g:gitgutter_sign_removed_first_line = '-'
let g:gitgutter_sign_removed_above_and_below = '='
let g:gitgutter_sign_modified_removed = '-'

let g:gitgutter_override_sign_column_highlight = 0
let g:gitgutter_set_sign_backgrounds = 1

highlight GitGutterAdd    guifg=#95e454 ctermfg=119
highlight GitGutterChange guifg=#cae682 ctermfg=180
highlight GitGutterDelete guifg=#e5786d ctermfg=173

highlight Normal ctermbg=none guibg=none
highlight SignColumn ctermbg=none guibg=none
" highlight LineNr ctermbg=none guibg=none

" ==== STATUS LINE ============================================================
" See `:h g:lightline.component` for details
" See `:h g:lightline.colorscheme` for available colorscheme

let g:lightline = {
	\ 'colorscheme': 'gruvbox',
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

