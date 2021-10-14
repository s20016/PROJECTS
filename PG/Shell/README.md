## **Ubuntu 20.04 LTS**

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
<summary>VS Code</summary>

```bash
$ sudo apt install software-properties-common apt-transport-https wge
$ wget -q https://packages.microsoft.com/keys/microsoft.asc -O- | sudo apt-key add -
$ sudo add-apt-repository "deb [arch=amd64] https://packages.microsoft.com/repos/vscode stable main"
$ sudo apt install code
```
</details>

<details>
<summary>Vagrant Box</summary>  

```bash
# NOTE: Disable Secure Boot from UEFI

# Install Vagrant Box
$ curl -fsSL https://apt.releases.hashicorp.com/gpg | sudo apt-key add -
$ sudo apt-add-repository "deb [arch=amd64] https://apt.releases.hashicorp.com $(lsb_release -cs) main"
$ sudo apt-get update && sudo apt-get install vagrant

# Create Box
$ mkdir ~/Boxes/TEST && cd $_
$ vagrant box add ubuntu/focal64
$ vagrant init ubuntu/focal64

# Initialize Vagrant
$ vagrant up && vagrant ssh

# Close Vagrant
$ vagrant halt

$ vagrant box list
$ vagrant destroy
$ vagrant status
```
</details>

