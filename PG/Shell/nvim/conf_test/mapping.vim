" =============================================================================
" Filename: ~/.config/nvim/mapping.vim
" Author: s20016
" Last Change: 2021/05/20
" =============================================================================

" For key mapping guide
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


" ==== CUSTOM CMD =============================================================
" When in nvim, enter cmd with `:<command name>`

command! FixWhiteSpace :%s/\s\+$//e                       
"  ==== AUTO CMD ===============================================================

autocmd BufEnter * set cursorline
autocmd BufLeave * set nocursorline

augroup vimrc-remember-cursor-position
	autocmd!
  autocmd BufReadPost * if line("'\"") > 1 && line("'\"") <= line("$") | exe "normal! g`\"" | endif
augroup END


