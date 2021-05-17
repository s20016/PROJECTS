" =============================================================================
" Filename: ~/.config/nvim/init.vim
" Author: s20016
" Last Change: 2021/05/17
" =============================================================================

call plug#begin(expand('~/.local/share/nvim/site/plugged'))

Plug 'morhetz/gruvbox'                                    " Gruvbox theme
Plug 'shinchu/lightline-gruvbox.vim'                      " Gruvbox limelight
Plug 'airblade/vim-gitgutter'                             " Gutter changes
Plug 'itchyny/lightline.vim'                              " Minimal status line
Plug 'tpope/vim-commentary'                               " Comment out lines
Plug 'tpope/vim-fugitive'                                 " Allows Git commands
Plug 'tpope/vim-surround'                                 " Surround brackets
Plug 'xolox/vim-misc'                                     " Vim session
Plug 'xolox/vim-session'                                  " Vim seesion
Plug 'tpope/vim-rhubarb'                                  " Github link
Plug 'SirVer/ultisnips'                                   " Snippet engine
Plug 'honza/vim-snippets'                                 " Snippets
Plug 'mattn/emmet-vim'                                    " HTML Emmet
Plug 'junegunn/fzf', { 'do': { -> fzf#install() } }       " Filter comd-line
Plug 'junegunn/fzf.vim'                                   " FZF ext.
Plug 'norcalli/nvim-colorizer.lua'                        " Color CSS
Plug 'jiangmiao/auto-pairs'                               " Auto pair brackets 
Plug 'dense-analysis/ale'                                 " Linting

" Plug 'mhinz/vim-startify'                                 " Custom vim start

call plug#end()

" Source file to include configs in nvim
source $HOME/.config/nvim/setting.vim
source $HOME/.config/nvim/mapping.vim

" NOTE:
" Sessions are saved in $HOME/.config/nvim/session/

" ==== PLUGIN CONFIG  =========================================================

" PLUGIN: Gruvbox Theme
let g:gruvbox_italic=1
colorscheme gruvbox

" PLUGIN: vim-commentary
autocmd FileType apache setlocal commentstring=#\ %s

" PLUGIN: colorizer.lua
lua require'colorizer'.setup()

" PLUGIN: Startify
" let g:startify_change_to_dir = 0
" let g:startify_session_dir = '~/.config/nvim/session'
" let g:startify_lists = [
" 	\ { 'type': 'sessions',  'header': ['   Sessions']       },
" 	\ { 'type': 'bookmarks', 'header': ['   Bookmarks']      }, ]
" let g:startify_bookmarks = [ {'c': '~/.config/nvim/init.vim'} ]
" let g:startify_custom_header = [
" 	\ '',
" 	\ '   NVIM STARTIFY',
" 	\ '', ]

" PLUGIN: Neovim Session
let g:session_directory = "~/.config/nvim/session"
let g:session_command_aliases = 1
let g:session_autoload = "no"
let g:session_autosave = "no"

" PLUGIN: FZF (Open below)
let g:fzf_layout = { 'down': '~40%' }


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

highlight GitGutterAdd    guifg=#95e454 ctermfg=119
highlight GitGutterChange guifg=#cae682 ctermfg=180
highlight GitGutterDelete guifg=#e5786d ctermfg=173
highlight SignColumn guibg=none ctermbg=none


" ==== STATUS LINE ============================================================
" See `:h g:lightline.component` for details
" See `:h g:lightline.colorscheme` for available colorscheme

let g:lightline = {
			\ 'colorscheme': 'gruvbox',
			\ 'active': {
			\ 'left': [
			\		[ 'mode', 'paste' ],
			\   [ 'gitbranch' ],  [ 'readonly', 'filename', 'modified' ] ],
	\ 'right': [
	\   [ 'lineinfo' ], [ 'percent' ], [ 'filetype' ] ]
	\ },
	\ 'component_function': {
  \   'gitbranch': 'FugitiveHead', 
  \   'lineinfo': 'LightlineLineinfo' }
	\ }

" Tab (Show filename only)
let g:lightline.tab = {
	\ 'active': [ 'filename' ],
	\ 'inactive': [ 'filename' ] }

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

