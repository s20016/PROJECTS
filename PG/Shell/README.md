## **Linux (Ubuntu)**

**Commands**
<details>
<summary>Show Password of Known Networks</summary>
<ul>
  <li>`$ ls /etc/NetworkManager/system-connections`</li>
  <li>`$ sudo cat /etc/NetworkManager/system-connections/NETWORK_NAME`</li>
  <li>Pre-Shared Key (psk) reveals the password</li>
</ul>
</details>

<details>
<summary>Change Directory Names JA to EN</summary>
- `$ LANG=C`
- `$ xdg-user-dirs-update`
</details>

<details>
<summary>Play Video (.mkv)</summary>
- `xdg-open ./VIDEO_NAME.mkv`
</details>

#
**Neovim**
<details>
<summary>Install Neovim</summary>
- `cd ~/PROJETCS/PG/Shell/nvim`
- `chmod 774 nvim.sh` if permission is not 744 level
- `./nvim.sh`
</details>

<details>
<summary>Create New Vim Session</summary>
- `$ nvim -p FILE_NAMES` 
- `:tabdo | set splitright | vsplit INPUT.txt | vertical resize -35 | set splitbelow | split OUTPUT.txt`
- `:mks ~/.config/nvim/session/SESSEION_NAME`
- `$ nvim -S PATH/SESSION_NAME`

NOTE:
- Includes: Python3 Linter
- Includes: NodeJS npm eslinter
</details>

#
**Install Programs**
<details>
<summary>Google Chrome (Ubuntu)</summary>
- Download [Google Chrome](https://www.google.co.jp/chrome/browser/desktop/index.html) and move to downloaded directory  
- `sudo apt install ./google-chrome-stable_current_amd64.deb`  
- **Disable Tab Search**
- Search in address bar `chrome://flags`
- Search "Tab Search" and disable 
<details>
<details>
<summary>VS Code (Ubuntu)</summary>
  - `sudo apt install software-properties-common apt-transport-https wge`
  - `wget -q https://packages.microsoft.com/keys/microsoft.asc -O- | sudo apt-key add -`
  - `sudo add-apt-repository "deb [arch=amd64] https://packages.microsoft.com/repos/vscode stable main"`
  - `sudo apt install code`
<details>
<details>
<summary>OBS Studio (Ubuntu)</summary>
  - `sudo apt install obs-studio -y` 
<details>
<details>
<summary>Vagrant Box (Ubuntu)</summary>
  - `sudo apt install virtualbox`
  - `mkdir ~/Boxes/TEST && cd $_`
  - `vagrant box add ubuntu/focal64`
  - `vagrant init ubuntu/focal64`
  - `vagrant up` to start, `vagrant ssh` to enter vagrantbox
  - `exit` to exit ssh, then `vagrant halt` to end 
  - `vagrant box list` to see installed vagrant
  - `vagrant destroy` to destroy vagrant
  - `vagrant status` to see working vagrant
<details>
<details>
<summary>Slack (Ubuntu)</summary>
  - `sudo snap install slack --classic`
  - `sudo snap remove slack`
<details>
<details>
<summary>LibreOffice (Ubuntu)</summary>
  - `sudo snap install libreoffice`
  - `sudo snap remove libreoffice`
