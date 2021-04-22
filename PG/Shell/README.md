## **Linux**

### **Commands**
- **Show Password of Known Networks**
  - `$ ls /etc/NetworkManager/system-connections`
  - `$ sudo cat /etc/NetworkManager/system-connections/NETWORK_NAME`
  - Pre-Shared Key (psk) reveals the password
- **Change Directory Names JA to EN**
  - `$ LANG=C`
  - `$ xdg-user-dirs-update`

#

### **Neovim**
- **Install Neovim**
  - `cd ~/PROJETCS/PG/Shell/nvim`
  - `chmod 774 nvim.sh` if permission is not 744 level
  - `./nvim.sh`
- **Create New Vim Session**
  - `$ nvim -p FILE_NAMES` 
  - `:tabdo | set splitright | vsplit INPUT.txt | vertical resize -35 | set splitbelow | split OUTPUT.txt`
  - `:mks ~/.config/nvim/session/SESSEION_NAME` `$ nvim -S PATH/SESSION_NAME`

NOTE:
- Installment inlcudes Python3 Linter

#

### **Install Programs**
- **Google Chrome (Ubuntu)**
  - Download [Google Chrome](https://www.google.co.jp/chrome/browser/desktop/index.html) and move to downloaded directory
  - `sudo apt install ./google-chrome-stable_current_amd64.deb`
- **VS Code (Ubuntu)**
  - `sudo apt install software-properties-common apt-transport-https wge`
  - `wget -q https://packages.microsoft.com/keys/microsoft.asc -O- | sudo apt-key add -`
  - `sudo add-apt-repository "deb [arch=amd64] https://packages.microsoft.com/repos/vscode stable main"`
  - `sudo apt install code`
- **OBS Studio (Ubuntu)**
  - `sudo apt install obs-studio -y` 
- **Vagrant Box (Ubuntu)**
  - `vagrant box list` to see installed vagrants
  - `sudo apt install virtualbox`
  - `curl -O https://releases.hashicorp.com/vagrant/2.2.9/vagrant_2.2.9_x86_64.deb`
  - `sudo apt install ./vagrant_2.2.9_x86_64.deb`
  - `vagrant -v` to verify
  - `mkdir -p ~/Vagrant/ && cd $_`
  - `vagrant init hashicorp/precise64`
  - ALT: `sudo apt install virtualbox`
  - `mkdir ./Boxes/TEST && cd $_`
  - `vagrant box add ubuntu/focal64`
  - `vagrant init ubuntu/focal64`
  - `vagrant up` to start, `vagrant ssh` to enter vagrantbox
  - `exit` to exit ssh, then `vagrant halt` to end 
  - `vagrant destroy` to destroy vagrant
  - `vagrant status`
- **Slack (Ubuntu)**
  - `sudo snap install slack --classic`
  - `sudo snap remove slack`
- **LibreOffice (Ubuntu)**
  - `sudo snap install libreoffice`
  - `sudo snap remove libreoffice`
