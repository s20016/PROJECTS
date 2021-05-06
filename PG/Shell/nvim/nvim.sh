#!/bin/bash

_CONFIG_DIR="$HOME/.config/nvim"
_PLUGIN_DIR="$HOME/.local/share/nvim/site/autoload"

YELLOW=$(tput setaf 3)
RED=$(tput setaf 1)
GREEN=$(tput setaf 2)
RESET=$(tput sgr 0)

sudo apt update
sudo apt install -y neovim
sudo apt install curl

if [ ! -d $_CONFIG_DIR ]; then
  mkdir -p $_CONFIG_DIR
fi

curl -fLo "$_PLUGIN_DIR/plug.vim" --create-dirs \
  https://raw.githubusercontent.com/junegunn/vim-plug/master/plug.vim

cp $HOME/PROJECTS/PG/Shell/nvim/conf/{init.vim,local_bundles.vim,local_init.vim} $_CONFIG_DIR

# Python3 Linter
install_python3() {
  sudo apt install -y python3-pip
  pip3 install flake8 autopep8 black isort
  echo -e "${GREEN}Updated: Python3 Settings${RESET}"
}

# Java
install_java() {
  sudo apt install -y default-jre default-jdk
  echo -e "${GREEN}Updated: Java Settings${RESET}"
}

# NodeJS
install_nodejs() {
  sudo apt install -y nodejs npm
  sudo npm install -g eslint
  sudo npm install -g prettier-standard standard
  echo -e "${GREEN}Updated: NodeJS Settings${RESET}"
}

# Select Language
echo -e "\n\033[1mSelect Language(s) to Install:\033[0m"
read -p "1) Python3  2) NodeJS  3) All: " INPUT_RES
case "$INPUT_RES" in
  '1') install_python3;;
  '2') install_nodejs;;
  '3') install_java;;
  '4') install_python3; install_java; install_nodejs;;
esac

# Save .bash_aliases
read -p "Do you want to save .bash_aliases? [Y/n] " RES
case "$RES" in
  [yY])
    cat ~/PROJECTS/PG/Shell/Config/.bash_aliases > ~/.bash_aliases
    echo -e "${YELLOW}Updated: nvim .bash_aliases${RESET}"
    ;;
  *)
    echo -e "${YELLOW}Updated: nvim${RESET}"
    ;;
esac

echo 'export PATH=$PATH:$HOME/.local/bin' >> $HOME/.bash_aliases
nvim +'PlugInstall --sync' +qa

echo  -e '\033[5mExecute: source ~/.bashrc\033[0m'
