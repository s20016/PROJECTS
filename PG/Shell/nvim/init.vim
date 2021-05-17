" ==============================================================================
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

call plug#end()

" ==== SETTINGS ===============================================================

filetype plugin indent on

syntax enable                           " Enables syntax highlighing
set autochdir                           " Change to cwd
set autoindent                          " Indent line similar to preceding line
set autoread                            " Auto detect changes outside nvim
set background=dark                     " Default color
set backspace=indent,eol,start          " Fix backspace indent
set clipboard+=unnamedplus              " Copy paste between nvim and prgrms
set termguicolors                       " Enables 24-bit color
set cursorline                          " Highlight current line
set encoding=utf-8                      " The encoding displayed
set fileencoding=utf-8                  " The encoding written to file
set fileformats=unix,dos,mac            " EOL of file format
set gcr=a:blinkon2                      " Gui cursor (Blink)
set gfn=Monospace\ 10                   " Guifont
set guioptions=egmrti                   " Describes component and options
set hidden                              " Enables hidden buffer
set hlsearch                            " Highlight all search pattern
set ignorecase                          " Ignore letter case
set incsearch                           " Show pettern while typing
set laststatus=2                        " Enable status line
set modeline                            " Enable modeline
set modelines=10
set mousemodel=popup                    " Hide mouse button
set noswapfile                          " Disable tmp files
set nowrap                              " Displays long lines as one line
set number                              " Toggle number line
set pumheight=10                        " Popup menu height
set ruler                               " Ruler in status line
set scrolloff=6                         " Minimal screen line above and below
set shiftwidth=2                        " One tab == 4 spaces
set showmatch                           " Hightlight matching bracketsa
set smartcase                           " Ignore letter case
set smartindent                         " Autoindent when starting new line
set softtabstop=2                       " Number of spaces a tab counts
set splitbelow                          " Horizontal splits below
set splitright                          " Vertical splits on right side
set t_Co=256                            " Support 256 colors
set tabstop=2                           " Insert 2 spaces for tab
set title                               " Set window title
set titleold="Terminal"                 " Default window title
set titlestring=%F                      " Title of window
set updatetime=100                      " Set update time for Git gutter
set visualbell                          " Error flash screen
set wildmenu                            " Cmd tab complete opt
set signcolumn=yes:1                    " Gutter column

" ==== MAPPINGS ===============================================================
" See :help key-notaion

" Map leader
let g:mapleader = ','

" Auto save
" au FocusGained,BufEnter * :silent! !
" au FocusLost,WinLeave * :silent! w

" Indent visual block
vmap < <gv
vmap > >gv

" Move visual block
vnoremap J :m '>+1<CR>gv=gv
vnoremap K :m '<-2<CR>gv=gv

" Faster scroll
nnoremap <M-j> 10gj
nnoremap <M-k> 10gk

" Skip by page
inoremap <C-b> <Left>
inoremap <C-f> <Right>

" Split
noremap <Leader>h :<C-u>split<CR>
noremap <Leader>v :<C-u>vsplit<CR>

" Switch tab
nnoremap <Tab> gt
nnoremap <S-Tab> gT
nnoremap <silent> <S-t> :tabnew<CR>

" Switch window
noremap <C-j> <C-w>j
noremap <C-k> <C-w>k
noremap <C-l> <C-w>l
noremap <C-h> <C-w>h

" Resize window
" nnoremap <M-k> :resize +2<CR>
" nnoremap <M-j> :resize -2<CR>
nnoremap <M-h> :vertical resize -2<CR>
nnoremap <M-l> :vertical resize +2<CR>

" Clear search highlight
nnoremap <silent> <leader><space> :noh<cr>

" PLUGIN: FZF
nnoremap <silent> <Leader>b :Buffers<CR>
nnoremap <silent> <C-f> :Files<CR>
nnoremap <silent> <Leader>f :Rg<CR>
nnoremap <silent> <Leader>/ :BLines<CR>
nnoremap <silent> <Leader>' :Marks<CR>
nnoremap <silent> <Leader>g :Commits<CR>
nnoremap <silent> <Leader>H :Helptags<CR>
nnoremap <silent> <Leader>hh :History<CR>
nnoremap <silent> <Leader>h: :History:<CR>
nnoremap <silent> <Leader>h/ :History/<CR>

" Automatically closing brackets
inoremap (<CR> ()<Esc>ha
inoremap {<CR> {}<Esc>ha
inoremap [<CR> []<Esc>ha

" Automatically closing quotes
inoremap "<CR> ""<Esc>ha
inoremap '<CR> ''<Esc>ha

" Commands
command! FixWhiteSpace :%s/\s\+$//e


" ==== PLUGIN CONFIG  =========================================================

" PLUGIN: Gruvebox Theme
let g:gruvbox_italic=1
colorscheme gruvbox

" PLUGIN: vim-commentary
autocmd FileType apache setlocal commentstring=#\ %s

" PLUGIN: colorizer.lua
lua require'colorizer'.setup()

" Startify
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
	\   [ 'gitbranch' ],  [ 'readonly', 'modified', 'filename' ] ],
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

" ==== AUTO CMD ===============================================================

augroup vimrc-remember-cursor-position
	autocmd!
  autocmd BufReadPost * if line("'\"") > 1 && line("'\"") <= line("$") | exe "normal! g`\"" | endif
augroup END

