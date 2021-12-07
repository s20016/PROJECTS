#!bin/bash

TMP_DIR=$(mktemp -d $HOME/s20016-XXX)
BACKUP_DIR="$HOME/ORIGINAL_CONF"
CONFIG_DIR="$HOME/.config/nvim"
SESSIO_DIR="$HOME/.config/nvim/session"
ALPLUG_DIR="$HOME/.local/share/nvim/site/plugged"

# Change tab color in lightline-gruvbox
gruvbox_tab() {
	sed -i '153s/mono0/green/g; 146s/mono4/mono0/g; 153s/mono5/mono0/g' \
		$ALPLUG_DIR/lightline-gruvbox.vim/plugin/lightline-gruvbox.vim
	}

# Save backup if $CONFIG_DIR exist
if [ -d $CONFIG_DIR ]; then
  echo "Installation will overwrite your current nvim configurations"
  read -p "Would you still like to continue? [Y/n] " RES
  case $RES in
    [Yy])
      echo "Processing Installation";
      mkdir $BACKUP_DIR;
      mv $CONFIG_DIR $BACKUP_DIR;
      rm -rf $ALPLUG_DIR;
      if [ ! -d $CONFIG_DIR ]; then
        echo "Backup Saved To $BACKUP_DIR";
      fi;;
    *   )
      echo "Installation Cancelled"; exit;;
  esac
fi

# Installing NVIM Config
if [ ! -d $CONFIG_DIR ]; then
  sudo apt update && sudo apt upgrade -y
  sudo apt install -y neovim
  sudo apt install curl
  mkdir -p $CONFIG_DIR
  sh -c 'curl -fLo "${XDG_DATA_HOME:-$HOME/.local/share}"/nvim/site/autoload/plug.vim --create-dirs \
    https://raw.githubusercontent.com/junegunn/vim-plug/master/plug.vim'
  cd $TMP_DIR && git clone https://github.com/s20016/MugenVim.git
	cp $TMP_DIR/MugenVim/conf/init.vim $CONFIG_DIR/.
  nvim +'PlugInstall --sync' +qa
	cp $TMP_DIR/MugenVim/conf/setting.vim $CONFIG_DIR/.
	cp $TMP_DIR/MugenVim/conf/mapping.vim $CONFIG_DIR/.
	cp $TMP_DIR/MugenVim/conf/plugins.vim $CONFIG_DIR/.
  mkdir $SESSIO_DIR
  gruvbox_tab
  nvim +'source $CONFIG_DIR/init.vim' +q
fi

nvim +'PlugInstall --sync' +qa
rm -rf $TMP_DIR
/
