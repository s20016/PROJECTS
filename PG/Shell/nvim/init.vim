" ==============================================================================
" Filename: ~/.config/nvim/init.vim
" Author: s20016
" Last Change: 2021/5/14
" =============================================================================

call plug#begin(expand('~/.local/share/nvim/site/plugged'))

Plug 'airblade/vim-gitgutter'           " Shows git changes in gutter
Plug 'itchyny/lightline.vim'            " Minimal status line
Plug 'tomasiser/vim-code-dark'          " VS Code color theme
Plug 'tpope/vim-commentary'             " Comment out lines
Plug 'tpope/vim-fugitive'               " Allows Git commands
Plug 'xolox/vim-misc'                   " Vim session
Plug 'xolox/vim-session'                " Vim seesion
Plug 'yuttie/comfortable-motion.vim'    " Easy to eyes scroll
Plug 'tpope/vim-surround'               " Surrounding bracket pairs
Plug 'mhinz/vim-startify'               " Start screen

call plug#end()

" ==== SETTINGS ===============================================================

filetype plugin indent on

syntax enable                           " Enables syntax highlighing
set autochdir                           " Change to cwd
set autoindent                          " Indent line similar to preceding line
set autoread                            " Auto detect changes outside nvim
set background=dark                     " Default color
set backspace=indent,eol,start          " Fix backspace indent
set clipboard=unnamedplus               " Copy paste between nvim and prgrms
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
set splitbelow                          " Horizontal splits below
set splitright                          " Vertical splits on right side
set t_Co=256                            " Support 256 colors
set tabstop=2                           " Insert 2 spaces for tab
set title                               " Set window title
set titleold="Terminal"                 " Default window title
set titlestring=%F                      " Title of window
set updatetime=100                      " Set update time for Git gutter
set visualbell                          " Error flash screen

" ==== MAPPINGS ===============================================================
" See :help key-notaion

" Map leader
let g:mapleader = ','

" Auto save
au FocusGained,BufEnter * :silent! !
au FocusLost,WinLeave * :silent! w

" Indent visual block
vmap < <gv
vmap > >gv

" Move visual block
vnoremap J :m '>+1<CR>gv=gv
vnoremap K :m '<-2<CR>gv=gv

" Faster scroll
nnoremap J 10gj
nnoremap K 10gk

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
nnoremap <M-j> :resize -2<CR>
nnoremap <M-k> :resize +2<CR>
nnoremap <M-h> :vertical resize -2<CR>
nnoremap <M-l> :vertical resize +2<CR>

" Clear search highlight
nnoremap <silent> <leader><space> :noh<cr>

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

" NVIM theme
colorscheme codedark

" Comment out (vim-commentary)
autocmd FileType apache setlocal commentstring=#\ %s

" Startify
let g:startify_change_to_dir = 0
let g:startify_session_dir = '~/.config/nvim/session'
let g:startify_lists = [
	\ { 'type': 'sessions',  'header': ['   Sessions']       },
	\ { 'type': 'bookmarks', 'header': ['   Bookmarks']      }, ]
let g:startify_bookmarks = [ {'c': '~/.config/nvim/init.vim'} ]
let g:startify_custom_header = [
	\ '',
	\ '   NVIM STARTIFY',
	\ '', ]

" Neovim Session
let g:session_directory = "~/.config/nvim/session"
let g:session_command_aliases = 1
let g:session_autoload = "no"
let g:session_autosave = "no"

" Git gutter
let g:gitgutter_async=0

" Comfortable motion scroll
let g:comfortable_motion_scroll_down_key = "j"
let g:comfortable_motion_scroll_up_key = "k"


" ==== STATUS LINE ============================================================

let g:lightline = {
	\ 'colorscheme': 'wombat',
	\ 'active': {
	\ 'left': [
	\		[ 'mode', 'paste' ],
	\   [ 'gitbranch', 'readonly', 'filename', 'modified' ] ]
	\ },
	\ 'component_function': { 'gitbranch': 'FugitiveHead' },
	\ }

let g:lightline.component_function = { 'lineinfo': 'LightlineLineinfo' }

" Highlight active window color
function! LightlineLineinfo() abort
	if winwidth(0) < 86
		return ''
	endif
	let l:current_line = printf('%-3s', line('.'))
	let l:max_line = printf('%-3s', line('$'))
	let l:lineinfo = ' ' . l:current_line . '/' . l:max_line
	return l:lineinfo
endfunction

" Tab color
let s:palette = g:lightline#colorscheme#wombat#palette
let s:palette.tabline.tabsel = [ [ '#444444', '#8ac6f2', 238, 117 ] ]
unlet s:palette

" Tab separator
let g:lightline.separator = { 'left': '', 'right': '' }
let g:lightline.subseparator = { 'left': '', 'right': '' }

" ==== AUTO CMD ===============================================================

augroup vimrc-remember-cursor-position
	autocmd!
  autocmd BufReadPost * if line("'\"") > 1 && line("'\"") <= line("$") | exe "normal! g`\"" | endif
augroup END
