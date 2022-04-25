" ============================================================================
" Filename: ~/.config/nvim/init.vim
" Author: s20016
" Last Change: Tue Apr 26 02:19:21 JST 2022
" =============================================================================

" Enables alias in nvim
let $BASH_ENV = "~/.bash_aliases"

" PATH
let g:python3_host_prog = '/usr/bin/python3'

" ==== PLUGIN =================================================================

call plug#begin(expand('~/.local/share/nvim/site/plugged'))

Plug 'SirVer/ultisnips'                                   " Snippet engine
Plug 'airblade/vim-gitgutter'                             " Gutter changes
Plug 'dense-analysis/ale'                                 " Linting
Plug 'hrsh7th/cmp-buffer'                                 " cmp extension
Plug 'hrsh7th/cmp-cmdline'                                " cmp extension
Plug 'hrsh7th/cmp-nvim-lsp'                               " cmp extension
Plug 'hrsh7th/cmp-path'                                   " cmp extension
Plug 'hrsh7th/nvim-cmp'                                   " cmp extension
Plug 'itchyny/lightline.vim'                              " Minimal statuline
Plug 'jiangmiao/auto-pairs'                               " Insert auto-pairs
Plug 'joshdick/onedark.vim'                               " Color Scheme
Plug 'junegunn/fzf', { 'do': { -> fzf#install() } }       " Filter cmd
Plug 'junegunn/fzf.vim'                                   " FZF ext.
Plug 'junegunn/goyo.vim'                                  " Distraction-free
Plug 'mattn/emmet-vim'                                    " Enable Emmet
Plug 'mg979/vim-visual-multi', {'branch': 'master'}       " Column select
Plug 'mhinz/vim-startify'                                 " Custom vim start
Plug 'neovim/nvim-lspconfig'                              " LSP
Plug 'norcalli/nvim-colorizer.lua'                        " Color CSS
Plug 'onsails/lspkind-nvim'                               " LSP pictograms
Plug 'ryanoasis/vim-devicons'                             " Enable icons
Plug 'tpope/vim-commentary'                               " Comment out lines
Plug 'tpope/vim-fugitive'                                 " Allows Git commands
Plug 'tpope/vim-rhubarb'                                  " Github link
Plug 'williamboman/nvim-lsp-installer'                    " LSP installer
Plug 'nvim-treesitter/nvim-treesitter', {'do': ':TSUpdate'}

call plug#end()

" Source file to include configs in nvim
source $HOME/.config/nvim/setting.vim
source $HOME/.config/nvim/mapping.vim
source $HOME/.config/nvim/plugins.vim

" NOTE:
" Sessions are saved in $HOME/.config/nvim/session/
" Netrwhist are saved in $HOME/.config/nvim/
