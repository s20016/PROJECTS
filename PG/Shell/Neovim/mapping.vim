" =============================================================================
" Filename: ~/.config/nvim/mapping.vim
" Author: s20016
" Last Change: Thu May 19 16:40:27 JST 2022
" =============================================================================

" For key mapping guide
" See :help key-notaion

" Map leader
" let g:mapleader = ','

" Auto save
" au FocusGained,BufEnter * :silent! !
" au FocusLost,WinLeave * :silent! w

nnoremap j gj
nnoremap k gk
vnoremap j gj
vnoremap k gk

" Indent visual block
vmap < <gv
vmap > >gv

" Move visual block
vnoremap J :m '>+1<CR>gv=gv
vnoremap K :m '<-2<CR>gv=gv

" Faster scroll
nnoremap <M-j> 10gj
nnoremap <M-k> 10gk

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
nnoremap <silent> <Leader>f :Files<CR>
" nnoremap <silent> <Leader>f :Rg<CR>
nnoremap <silent> <Leader>/ :BLines<CR>
nnoremap <silent> <Leader>' :Marks<CR>
nnoremap <silent> <Leader>g :Commits<CR>
nnoremap <silent> <Leader>H :Helptags<CR>
nnoremap <silent> <Leader>hh :History<CR>
nnoremap <silent> <Leader>h: :History:<CR>
nnoremap <silent> <Leader>h/ :History/<CR>

" ==== CUSTOM CMD =============================================================
" When in nvim, enter cmd with `:<command name>`

" Run current file and redirect to output.txt
function! ExecuteFileToOutput() abort
	let l:fn = ("%")
	let l:ft = expand("%:e")
	if l:ft == "py"
		execute "!cat input.txt | python3 " . l:fn . " > output.txt"
	elseif l:ft == "js"
		execute "!cat ./input.txt | node " . l:fn . " > ./output.txt"
  elseif l:ft == "java"
    execute "!cat ./input.txt | java "  . l:fn . " > ./output.txt"
	endif
endfunction

" command! Run :call ExecuteFileToOutput()
command! FixWhiteSpace :%s/\s\+$//e

" [IN VIM SESSION], save file and ExecuteFileToOuput()
nnoremap <Leader>w :silent wa \| :call ExecuteFileToOutput()<CR>

let g:NetrwIsOpen=0

function! ToggleNetrw()
    if g:NetrwIsOpen
        let i = bufnr("$")
        while (i >= 1)
            if (getbufvar(i, "&filetype") == "netrw")
                silent exe "bwipeout " . i
            endif
            let i-=1
        endwhile
        let g:NetrwIsOpen=0
    else
        let g:NetrwIsOpen=1
        silent tabdo Lexplore
    endif
endfunction

noremap <silent> <C-E> :call ToggleNetrw()<CR>

"  ==== AUTO CMD ===============================================================

" autocmd BufWritePre <buffer> <cmd>EslintFixAll<CR>

autocmd BufEnter * set cursorline
autocmd BufLeave * set nocursorline

function! ResCur()
  if line("'\"") <= line("$")
    normal! g`"
    return 1
  endif
endfunction

augroup resCur
  autocmd!
  autocmd BufWinEnter * call ResCur()
augroup END
