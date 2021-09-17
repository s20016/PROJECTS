#!/bin/bash

# Vertical split vimtutor (JA/EN)
open() {
  ja_tutor=$(locate tutor.ja.utf-8)
  en_tutor="${ja_tutor%/*}/tutor"
  vi -O $ja_tutor $en_tutor +"tabdo windo set nu scb"
}

# Check 'locate' if installed
abort() { 
	echo -e "\nCommand 'locate' not found, but can be installed with:
\nsudo apt install mlocate\n"
}

if [ ! -x "$(command -v locate)" ]; then abort; else open; fi
