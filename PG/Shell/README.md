## **Linux (Ubuntu)**

### Commands
<details>
<summary><bold>Show Password of Known Networks</bold></summary>

```bash
$ ls /etc/NetworkManager/system-connections
$ sudo cat /etc/NetworkManager/system-connections/NETWORK_NAME
# Pre-Shared Key (psk) reveals the password
```
</details>

<details>
<summary><bold>Change Directory Names JA to EN</bold></summary>

```bash
$ LANG=C
$ xdg-user-dirs-update
```
</details>

<details>
<summary><bold>Play Video (.mkv)</bold></summary>

```bash
xdg-open ./VIDEO_NAME.mkv
```
</details>

#
### Neovim  
<details>
<summary><bold>Install Neovim</bold></summary>

```bash
cd ~/PROJETCS/PG/Shell/nvim
chmod 774 nvim.sh if permission is not 744 level
./nvim.sh
```
</details>

<details>
<summary><bold>Create New Vim Session</bold></summary>

```bash
$ nvim -p FILE_NAMES 
:tabdo | set splitright | vsplit INPUT.txt | vertical resize -35
:tabdo | set splitbelow | split OUTPUT.txt
:mks ~/.config/nvim/session/SESSEION_NAME
$ nvim -S PATH/SESSION_NAME

# Includes: Python3 Linter
# Includes: NodeJS npm eslinter
```
</details>

#
### Install Programs
<details>
<summary><bold>Google Chrome (Ubuntu)</bold></summary>

Download [Google Chrome](https://www.google.co.jp/chrome/browser/desktop/index.html) and move to downloaded directory

```bash
$ sudo apt install ./google-chrome-stable_current_amd64.deb
```

**Disable Tab Search**
- Search in address bar chrome://flags
- Search "Tab Search" and disable 
</details>

<details>
<summary><bold>VS Code (Ubuntu)</bold></summary>

```bash
$ sudo apt install software-properties-common apt-transport-https wge
$ wget -q https://packages.microsoft.com/keys/microsoft.asc -O- | sudo apt-key add -
$ sudo add-apt-repository "deb [arch=amd64] https://packages.microsoft.com/repos/vscode stable main"
$ sudo apt install code
```
</details>

<details>
<summary><bold>OBS Studio (Ubuntu)</bold></summary>

```bash
sudo apt install obs-studio -y 
```
</details>

<details>
<summary><bold>Vagrant Box (Ubuntu)</bold></summary>

```bash
$ sudo apt install virtualbox
$ mkdir ~/Boxes/TEST && cd $_
$ vagrant box add ubuntu/focal64
$ vagrant init ubuntu/focal64
$ vagrant up && vagrant ssh
# exit to exit ssh, then vagrant halt to end 

$ vagrant box list
$ vagrant destroy
$ vagrant status
```
</details>

<details>
<summary><bold>Slack (Ubuntu)</bold></summary>

```bash
$ sudo snap install slack --classic
$ sudo snap remove slack
```
</details>

<details>
<summary><bold>LibreOffice (Ubuntu)</bold></summary>

```bash
$ sudo snap install libreoffice
$ sudo snap remove libreoffice
```
</details>
