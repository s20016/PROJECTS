#!/bin/bash

# This installation by default includes:
#   Python3 and Java
#
# To include NodeJS:
#   Uncomment `install_nodejs()` in MAIN

# Python3 & Java
install_default() {
  sudo apt install -y python3-pip
  pip3 install --user pynvim
  pip3 install --upgrade pynvim
  pip3 install flake8 autopep8 black isort
  sudo apt install -y default-jre default-jdk
}

# NodeJS
install_nodejs() {
  sudo apt install -y nodejs npm
  sudo npm install -g eslint
  sudo npm install -g prettier-standard standard
}

# Check for existing nvim config
if [ -d "$HOME/.config/nvim" ]; then
  echo "Installation will overwrite your current nvim configurations"
  read -p "Would you still like to continue? [Y/n] " RES
  case $RES in
    [Yy]) echo "";;
    *   ) echo "Installation Canceled"; exit;;
  esac
fi

TMP_DIR=$(mktemp -d $HOME/s20016-XXX)
CONFIG_DIR="$HOME/.config/nvim"
PLUGIN_DIR="$HOME/.local/share/nvim/site/autoload"

# Installing vim-plug
if [ ! -d $CONFIG_DIR ]; then
  sudo apt update
  sudo apt install -y neovim
  sudo apt install curl
  mkdir -p $CONFIG_DIR
  curl -fLo "$PLUGIN_DIR/plug.vim" --create-dirs \
    https://raw.githubusercontent.com/junegunn/vim-plug/master/plug.vim
  nvim +'PlugInstall --sync' +qa
fi

# Setting up nvim config
if [ -f "$PLUG_DIR/plug.vim" ]; then
  git clone https://github.com/s20016/nvim.git $TMP_DIR
  cp $TMP_DIR/nvim/conf/{init,setting,mapping}.vim $CONFIG_DIR
  mkdir $CONFIG_DIR/session
fi

# MAIN
install_default
# install_nodejs

nvim +'PlugInstall --sync' +qa
rm -rf $TMP_DIR

