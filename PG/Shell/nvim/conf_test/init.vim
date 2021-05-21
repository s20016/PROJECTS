" =============================================================================
" Filename: ~/.config/nvim/init.vim
" Author: s20016
" Last Change: 2021/05/20
" =============================================================================

" Enables alias in nvim
let $BASH_ENV = "~/.bash_aliases"

" Python3 PATH
let g:python3_host_prog = '/usr/bin/python3'

" ==== PLUGIN =================================================================

call plug#begin(expand('~/.local/share/nvim/site/plugged'))

Plug 'morhetz/gruvbox'                                    " Gruvbox theme
Plug 'shinchu/lightline-gruvbox.vim'                      " Gruvbox limelight
Plug 'mhinz/vim-startify'                                 " Custom vim start

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
Plug 'mg979/vim-visual-multi', {'branch': 'master'}       " Column select
Plug 'junegunn/goyo.vim'                                  " Distraction-free

" Plug 'tomasiser/vim-code-dark'                            " VS Code theme

call plug#end()

" Source file to include configs in nvim
source $HOME/.config/nvim/setting.vim
source $HOME/.config/nvim/mapping.vim
source $HOME/.config/nvim/plugins.vim

" NOTE:
" Sessions are saved in $HOME/.config/nvim/session/
" Netrwhist are saved in $HOME/.config/nvim/
