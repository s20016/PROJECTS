" =============================================================================
" Filename: ~/.config/nvim/setting.vim
" Author: s20016
" Last Change: 2021/05/20
" =============================================================================

filetype plugin indent on

syntax enable                           " Enables syntax highlighing
set autochdir                           " Change to cwd
set autoindent                          " Indent ln similar to preceding ln
set autoread                            " Auto detect changes outside nvim
set background=dark                     " Default color
set backspace=indent,eol,start          " Fix backspace indent
set clipboard+=unnamedplus              " Copy paste between nvim and prgrms
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
set signcolumn=yes:1                    " Gutter column
set smartcase                           " Ignore letter case
set smartindent                         " Autoindent when starting new line
set softtabstop=2                       " Number of spaces a tab counts
set splitbelow                          " Horizontal splits below
set splitright                          " Vertical splits on right side
set t_Co=256                            " Support 256 colors
set tabstop=2                           " Insert 2 spaces for tab
set termguicolors                       " Enables 24-bit color
set title                               " Set window title
set titlestring=%F                      " Title of window
set updatetime=100                      " Set update time for Git gutter
set visualbell                          " Error flash screen
set wildmenu                            " Cmd tab complete opt

" set relativenumber                      " Number relative to line
" set colorcolumn=80                      " Add col color in ln 80
" set spell                               " Check spelling erros
