#!/bin/bash

_CONFIG_DIR="$HOME/.config/nvim"
_PLUGIN_DIR="$HOME/.local/share/nvim/site/autoload"

sudo apt install neovim -y
sudo apt install curl

if [ ! -d $_CONFIG_DIR ]; then
    mkdir -p $_CONFIG_DIR
fi

curl -fLo "$_PLUGIN_DIR/plug.vim" --create-dirs \
    https://raw.githubusercontent.com/junegunn/vim-plug/master/plug.vim

cp ./conf/{init.vim,local_bundles.vim,local_init.vim} $_CONFIG_DIR


### Python3 Linter
sudo apt install python3-pip
pip3 install flake8 autopep8 black isort
echo 'export PATH=$PATH:$HOME/.local/bin' >> $HOME/.bash_aliases

vim +'PlugInstall --sync' +qa
