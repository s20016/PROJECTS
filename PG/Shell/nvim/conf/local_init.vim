set mouse-=a "no mouse
set clipboard+=unnamedplus
let g:loaded_matchparen=1

" Default Tab Space
set tabstop=2
set shiftwidth=2

" PG Tab Space
autocmd Filetype python setlocal ts=4 sw=4 expandtab
autocmd Filetype kotlin setlocal ts=4 sw=4 expandtab
autocmd Filetype java setlocal ts=4 sw=4 expandtab
autocmd Filetype c setlocal ts=4 sw=4 expandtab

" Ale_linters
let g:ale_linters = {
    \ 'python': ['flake8'],
    \ 'javascript': ['standard'],
    \ }

let g:ale_fixers = {
    \ 'python':['autopep8','black','isort'],
    \ 'javascript': ['prettier_standard'],
    \ 'javascriptreact': ['prettier_standard'],
    \ }

let g:ale_lint_on_save = 1
let g:ale_fix_on_save = 1

set cursorline
set list
set listchars=tab:>\ ,extends:<

highlight ZenkakuSpace cterm=underline ctermfg=red guibg=darkgray
match ZenkakuSpace /　/

" Map
nmap \q :nohlsearch<CR>

noremap <BS> <Nop>
noremap <UP> <Nop>
noremap <Down> <Nop>
noremap <Left> <Nop>
noremap <Right> <Nop>

noremap! <BS> <Nop>
noremap! <UP> <Nop>
noremap! <Down> <Nop>
noremap! <Left> <Nop>
noremap! <Right> <Nop>

" Command History
cnoremap <C-p> <Up>
cnoremap <C-n> <Down>

" Buffer
nnoremap <silent> [b :bprevious<CR>
nnoremap <silent> ]b :bnext<CR>
nnoremap <silent> [B :bfirst<CR>
nnoremap <silent> ]B :blast<CR>

" Insert Mode での移動
inoremap <C-e> <END>
inoremap <C-a> <HOME>
inoremap <C-b> <Left>
inoremap <C-f> <Right>
inoremap <silent> jj <ESC>
inoremap <silent> <C-j> <ESC>

" Visual Mode with v
vnoremap v $h
