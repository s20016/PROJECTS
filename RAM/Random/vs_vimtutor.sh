#!/bin/bash

# Vertical split vimtutor (JA/EN)
open_vimtutor() {
  ja_tutor=$(locate tutor.ja.utf-8)
  en_tutor="${ja_tutor%/*}/tutor"
  vi -O $ja_tutor $en_tutor +"tabdo windo set nu scb"
}

# Command 'locate' not found
abort_script() {
  echo `locate`
  exit
}

if [ ! -x "$(command -v locate)" ]; then abort_script; else open_vimtutor; fi
