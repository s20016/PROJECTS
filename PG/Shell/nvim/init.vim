" ==============================================================================
" Filename: ~/.config/nvim/init.vim
" Author: s20016
" Last Change: 2021/5/14
" =============================================================================

call plug#begin(expand('~/.local/share/nvim/site/plugged'))

Plug 'tpope/vim-sensible'
Plug 'tpope/vim-commentary'
Plug 'junegunn/seoul256.vim'
Plug 'xolox/vim-misc'
Plug 'xolox/vim-session'
Plug 'tomasiser/vim-code-dark'
" Plug 'vim-airline/vim-airline'
" Plug 'vim-airline/vim-airline-themes'
Plug 'itchyny/lightline.vim'

call plug#end()

filetype plugin indent on

" ==== SETTINGS ===============================================================

syntax enable                           " Enables syntax highlighing
set t_Co=256                            " Support 256 colors
set encoding=utf-8                      " The encoding displayed
set fileencoding=utf-8                  " The encoding written to file
set backspace=indent,eol,start          " Fix backspace indent
set hidden                              " Enables hidden buffer
set nowrap                              " Displays long lines as one line
set pumheight=10                        " Popup menu height
set ruler                               " Ruler in status line
set splitbelow                          " Horizontal splits below
set splitright                          " Vertical splits on right side
set smartindent                         " Autoindent when starting new line
set autoindent                          " Indent line similar to preceding line
set showmatch                           " Hightlight matching bracketsa
set number                              " Toggle number line
set relativenumber                      " Toggle relative numbering
set cursorline                          " Highlight current line
set gfn=Monospace\ 10                   " Guifont
set background=dark                     " Default color
set clipboard+=unnamedplus               " Copy paste between nvim and prgrms
set hlsearch                            " Highlight all search pattern
set incsearch                           " Show pettern while typing
set ignorecase                          " Ignore letter case
set smartcase                           " Ignore letter case
set scrolloff=6                         " Minimal screen line above and below
set gcr=a:blinkon2                      " Gui cursor (Blink)
set guioptions=egmrti                   " Describes component and options
set fileformats=unix,dos,mac            " EOL of file format
set mousemodel=popup                    " Hide mouse button
set laststatus=2                        " Enable status line
set modeline                            " Enable modeline
set modelines=10
set title                               " Set window title
set titleold="Terminal"                 " Default window title
set titlestring=%F
set tabstop=2                           " Insert 2 spaces for tab
set shiftwidth=2                        " Levels of indentation
set autoread                            " Auto detect changes outside nvim
set visualbell                          " Error flash screen
set noswapfile                          " Disable tmp files

" Auto save
au FocusGained,BufEnter * :silent! !
au FocusLost,WinLeave * :silent! w


" ==== MAPPINGS ===============================================================

" Map leader
let g:mapleader = ','

" Indent visual block
vmap < <gv
vmap > >gv

" Move visual block
vnoremap J :m '>+1<CR>gv=gv
vnoremap K :m '<-2<CR>gv=gv

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

" Indentation Level
autocmd Filetype python setlocal ts=4 sw=4 expandtab
autocmd Filetype kotlin setlocal ts=4 sw=4 epandtab
autocmd Filetype java setlocal ts=4 sw=4 expandtab
autocmd Filetype c setlocal ts=4 sw=4 expandtab

" Commands
command! FixWhiteSpace :%s/\s\+$//e


" ==== PLUGIN CONFIG  =========================================================

" tomasiser/vim-code/dark
colorscheme codedark

" Comment out (vim-commentary)
autocmd FileType apache setlocal commentstring=#\ %s

" Neovim Session
let g:session_directory = "~/.config/nvim/session"
let g:session_command_aliases = 1
let g:session_autoload = "no"
let g:session_autosave = "no"

" " Airline Configuration
" let g:airline_theme = 'bubblegum'
" let g:airline#extensions#tabline#enabled = 1
" let g:airline#extensions#tabline#tab_nr_type = 1
" let g:airline#extensions#tabline#fnamemod = ':t'
" let g:airline#extensions#tabline#left_sep = ''
" let g:airline#extensions#tabline#left_alt_sep = ''
" let g:airline#extensions#tabline#right_sep = ''
" let g:airline#extensions#tabline#right_alt_sep = ''
" let g:airline_left_sep = ''
" let g:airline_right_sep = ''

" if !exists('g:airline_symbols')
"     let g:airline_symbols = {}
"   endif

" " Unicode symbols
" let g:airline_symbols.colnr = 'Col'
" let g:airline_symbols.crypt = ''
" let g:airline_symbols.linenr = ''
" let g:airline_symbols.linenr = ''
" let g:airline_symbols.linenr = ''
" let g:airline_symbols.linenr = ''
" let g:airline_symbols.maxlinenr = ''
" let g:airline_symbols.maxlinenr = ''
" let g:airline_symbols.branch = ''
" let g:airline_symbols.paste = ''
" let g:airline_symbols.paste = ''
" let g:airline_symbols.paste = ''
" let g:airline_symbols.spell = ''
" let g:airline_symbols.notexists = ''
" let g:airline_symbols.whitespace = ''

" Lighline Configuration
let g:lightline = {
      \ 'colorscheme': 'seoul256',
      \ }

" Currently, wombat, solarized, powerline, powerlineish, jssjdf
" jellybeans, molokai, seoul256, darcula	Vj,
" selenized_dark, selenized_black, selenized_light, selenized_white,
" Tomorrow, Tomorrow_Night, Tomorrow_Night_Blue,
" Tomorrow_Night_Bright, Tomorrow_Night_Eighties, PaperColor,
" landscape, one, materia, material, OldHope, nord, deus,
" simpleblack, srcery_drk, ayu_mirage, ayu_light, ayu_dark,


" ==== AUTO CMD ===============================================================
augroup vimrc-remember-cursor-position
  autocmd!
  autocmd BufReadPost * if line("'\"") > 1 && line("'\"") <= line("$") | exe "normal! g`\"" | endif
augroup END
