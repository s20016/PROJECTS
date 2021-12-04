" ============================================================================
" Filename: ~/.config/nvim/init.vim
" Author: s20016
" Last Change: Sat Dec  4 22:49:40 JST 2021
" =============================================================================

" Enables alias in nvim
let $BASH_ENV = "~/.bash_aliases"

" PATH
let g:python3_host_prog = '/usr/bin/python3'

" ==== PLUGIN =================================================================

call plug#begin(expand('~/.local/share/nvim/site/plugged'))

Plug 'hrsh7th/cmp-buffer'                                 " LSP
Plug 'hrsh7th/cmp-cmdline'
Plug 'hrsh7th/cmp-nvim-lsp'
Plug 'hrsh7th/cmp-path'
Plug 'hrsh7th/nvim-cmp'
Plug 'neovim/nvim-lspconfig'                              
Plug 'onsails/lspkind-nvim'

Plug 'SirVer/ultisnips'                                   " Snippet engine
Plug 'airblade/vim-gitgutter'                             " Gutter changes
Plug 'dense-analysis/ale'                                 " Linting
Plug 'honza/vim-snippets'                                 " Snippet files
Plug 'honza/vim-snippets'                                 " Snippets
Plug 'itchyny/lightline.vim'                              " Minimal status line
Plug 'jiangmiao/auto-pairs'                               " Auto pair brackets 
Plug 'joshdick/onedark.vim'                               " Color Scheme
Plug 'junegunn/fzf', { 'do': { -> fzf#install() } }       " Filter cmd
Plug 'junegunn/fzf.vim'                                   " FZF ext.
Plug 'junegunn/goyo.vim'                                  " Distraction-free
Plug 'mattn/emmet-vim'                                    " HTML Emmet
Plug 'mg979/vim-visual-multi', {'branch': 'master'}       " Column select
Plug 'mhinz/vim-startify'                                 " Custom vim start
Plug 'norcalli/nvim-colorizer.lua'                        " Color CSS
Plug 'quangnguyen30192/cmp-nvim-ultisnips'                " cmp + ultisnips
Plug 'tpope/vim-commentary'                               " Comment out lines
Plug 'tpope/vim-fugitive'                                 " Allows Git commands
Plug 'tpope/vim-rhubarb'                                  " Github link
Plug 'xolox/vim-misc'                                     " Vim session
Plug 'xolox/vim-session'                                  " Vim session
Plug 'ryanoasis/vim-devicons'                             " NerdFont

call plug#end()

" Source file to include configs in nvim
source $HOME/.config/nvim/setting.vim
source $HOME/.config/nvim/mapping.vim
source $HOME/.config/nvim/plugins.vim

" NOTE:
" Sessions are saved in $HOME/.config/nvim/session/
" Netrwhist are saved in $HOME/.config/nvim/
