#!/bin/bash

# Locate vimtutor (C/ja) files
JA_TUTOR=$(locate tutor.ja.utf-8)
EN_TUTOR="${JA_TUTOR%/*}/tutor"

vi -O $JA_TUTOR $EN_TUTOR +"tabdo windo set nu scrollbind" 
