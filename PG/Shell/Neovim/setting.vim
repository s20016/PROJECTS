" =============================================================================
" Filename: ~/.config/nvim/setting.vim
" Author: s20016
" Last Change: Tue Jun 14 12:31:37 JST 2022
" =============================================================================

filetype plugin indent on

syntax enable                           " Enables syntax highlighting
set autochdir                           " Change to cwd
set autoindent                          " Indent ln similar to preceding ln
set autoread                            " Auto detect changes outside nvim
set background=dark                     " Default color
set backspace=indent,eol,start          " Fix backspace indent
set clipboard+=unnamedplus              " Copy paste between nvim and prgrms
set completeopt=menu,menuone,noselect   " Enables popup menu
set encoding=UTF-8                      " String encoding
set expandtab                           " Use tab
set fileformats=unix,dos,mac            " EOL of file format
set gcr=a:blinkon2                      " Gui cursor (Blink)
set gfn=Monospace\ 10                   " Guifont
set guioptions=egmrti                   " Describes component and options
set hidden                              " Enables hidden buffer
set hlsearch                            " Highlight all search pattern
set ignorecase                          " Ignore letter case
set inccommand=split                    " Show change in split
set incsearch                           " Show pattern while typing
set laststatus=2                        " Enable status line
set modeline                            " Enable modeline
set modelines=10                        " Gives checked lines
set mouse=a                             " Enables mouse support
set mousemodel=popup                    " Hide mouse button
set noshowmode                          " Hide message
set noswapfile                          " Disable tmp files
set nowrap                              " Displays long lines as one line
set pumheight=10                        " Pop-up menu height
set relativenumber                              " Toggle line number
set ruler                               " Ruler in status line
set scrolloff=6                         " Minimal screen line above and below
set shiftwidth=2                        " One tab == 2 spaces
set showmatch                           " Highlight matching brackets
set signcolumn=yes:1                    " Gutter column
set smartcase                           " Ignore letter case
set smartindent                         " Auto-indent when starting new line
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
set wrap breakindent                    " Ends and continue to next line
