#!/bin/bash

# Vertical split vimtutor (JA/EN)
open_vimtutor() {
  ja_tutor=$(locate tutor.ja.utf-8)
  en_tutor="${ja_tutor%/*}/tutor"
  vi -O $ja_tutor $en_tutor +"tabdo windo set nu scb"
}

if [ ! -x "$(command -v locate)" ]; then echo `locate` ; else open_vimtutor; fi
