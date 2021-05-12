## **Linux (Ubuntu)**

### Commands
<details>
<summary>Show Password of Known Networks</summary>

```bash
$ ls /etc/NetworkManager/system-connections
$ sudo cat /etc/NetworkManager/system-connections/NETWORK_NAME
# Pre-Shared Key (psk) reveals the password
```
</details>

<details>
<summary>Change Directory Names JA to EN</summary>

```bash
$ LANG=C
$ xdg-user-dirs-gtk-update
```
</details>

<details>
<summary>Play Video (.mkv)</summary>

```bash
xdg-open ./VIDEO_NAME.mkv
```
</details>

#
### Neovim  
<details>
<summary>Install Neovim</summary>

```bash
$ cd ~/PROJETCS/PG/Shell/nvim
$ ./nvim.sh

# Includes: Python3, Java, NodeJS
# Updates: .bash_aliases
# Adds: Git configuration (s20016)
```
</details>

<details>
<summary>Create New Vim Session</summary>

```bash
$ nvim -p FILE_NAMES 
:tabdo | set splitright | vsplit INPUT.txt | vertical resize -35
:tabdo | set splitbelow | split OUTPUT.txt
:mks ~/.config/nvim/session/SESSEION_NAME
$ nvim -S PATH/SESSION_NAME
```
</details>

#
### Common Issues
<details>
<summary>Desktop is HOME Directory</summary>

```bash
# Look for .config/user-dirs.dirs
$ nvim ~/.config/user-dirs.dirs

# Replace similar lines with:
XDG_DESKTOP_DIR="$HOME/Desktop"
XDG_DOWNLOAD_DIR="$HOME/Downloads"
XDG_TEMPLATES_DIR="$HOME/Templates"
XDG_PUBLICSHARE_DIR="$HOME/Public"
XDG_DOCUMENTS_DIR="$HOME/Documents"
XDG_MUSIC_DIR="$HOME/Music"
XDG_PICTURES_DIR="$HOME/Pictures"
XDG_VIDEOS_DIR="$HOME/Videos"
# Save and Quit nvim

$ xdg-user-dirs-update --force
$ LANG=C
$ xdg-user-dirs-gtk-update
# Logout and Login again
```
</details>

#
### Install Programs
<details>
<summary>IntelliJ IDEA (Kotlin)</summary>

Download [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=linux). Note: file must be .tar.gz

```bash
# sudo apt update
# sudo apt install -y default-jre default-jdk

$ cd ~/Downloads
$ tar -xf idealE...tar.gz -C ~/Documents
$ cd ~/Documents/idea-IC.../bin
$ ./idea.sh
```

**Desktop Icon:**
- Open IntelliJ IDEA
- Tools > Create Desktop Entry 
</details>

<details>
<summary>Google Chrome</summary>

Download [Google Chrome](https://www.google.co.jp/chrome/browser/desktop/index.html) and move to downloaded directory

```bash
$ sudo apt install ./google-chrome-stable_current_amd64.deb
```

**Disable Tab Search**
- Search in address bar chrome://flags
- Search "Tab Search" and disable 
</details>

<details>
<summary>VS Code</summary>

```bash
$ sudo apt install software-properties-common apt-transport-https wge
$ wget -q https://packages.microsoft.com/keys/microsoft.asc -O- | sudo apt-key add -
$ sudo add-apt-repository "deb [arch=amd64] https://packages.microsoft.com/repos/vscode stable main"
$ sudo apt install code
```
</details>

<details>
<summary>OBS Studio</summary>

```bash
sudo apt install obs-studio -y 
```
</details>

<details>
<summary>Vagrant Box</summary>

```bash
$ sudo apt install virtualbox

# Create Box
$ mkdir ~/Boxes/TEST && cd $_
$ vagrant box add ubuntu/focal64
$ vagrant init ubuntu/focal64
$ vagrant up && vagrant ssh
$ exit
$ vagrant halt

$ vagrant box list
$ vagrant destroy
$ vagrant status
```
</details>

<details>
<summary>Slack</summary>

```bash
$ sudo snap install slack --classic
$ sudo snap remove slack
```
</details>

<details>
<summary>LibreOffice</summary>

```bash
$ sudo snap install libreoffice
$ sudo snap remove libreoffice
```
</details>
