#!/bin/bash

# Vertical split vimtutor (JA/EN)
open_vimtutor() {
  JA_TUTOR=$(locate tutor.ja.utf-8)
  EN_TUTOR="${JA_TUTOR%/*}/tutor"
  vi -O $JA_TUTOR $EN_TUTOR +"tabdo windo set nu scb"
}

# Command 'locate' not found
abort_script() {
  echo -e "Command 'locate' not found."
  exit
}

if [ ! -x "$(command -v locate)" ]; then abort_script; else open_vimtutor; fi
