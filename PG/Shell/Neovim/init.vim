" =============================================================================
" Filename: ~/.config/nvim/init.vim
" Author: s20016
" Last Change: Sun May 23 12:08:58 JST 2021
" =============================================================================

" Enables alias in nvim
let $BASH_ENV = "~/.bash_aliases"

" Python3 PATH
let g:python3_host_prog = '/usr/bin/python3'

" ==== PLUGIN =================================================================

call plug#begin(expand('~/.local/share/nvim/site/plugged'))

Plug 'SirVer/ultisnips'                                   " Snippet engine
Plug 'airblade/vim-gitgutter'                             " Gutter changes
Plug 'dense-analysis/ale'                                 " Linting
Plug 'honza/vim-snippets'                                 " Snippets
Plug 'itchyny/lightline.vim'                              " Minimal status line
Plug 'jiangmiao/auto-pairs'                               " Auto pair brackets 
Plug 'junegunn/fzf', { 'do': { -> fzf#install() } }       " Filter cmd
Plug 'junegunn/fzf.vim'                                   " FZF ext.
Plug 'junegunn/goyo.vim'                                  " Distraction-free
Plug 'mattn/emmet-vim'                                    " HTML Emmet
Plug 'mg979/vim-visual-multi', {'branch': 'master'}       " Column select
Plug 'mhinz/vim-startify'                                 " Custom vim start
Plug 'morhetz/gruvbox'                                    " Gruvbox theme
Plug 'norcalli/nvim-colorizer.lua'                        " Color CSS
Plug 'shinchu/lightline-gruvbox.vim'                      " Gruvbox limelight
Plug 'tpope/vim-commentary'                               " Comment out lines
Plug 'tpope/vim-fugitive'                                 " Allows Git commands
Plug 'tpope/vim-rhubarb'                                  " Github link
Plug 'xolox/vim-misc'                                     " Vim session
Plug 'xolox/vim-session'                                  " Vim session

call plug#end()

" Source file to include configs in nvim
source $HOME/.config/nvim/setting.vim
source $HOME/.config/nvim/mapping.vim
source $HOME/.config/nvim/plugins.vim

" NOTE:
" Sessions are saved in $HOME/.config/nvim/session/
" Netrwhist are saved in $HOME/.config/nvim/
