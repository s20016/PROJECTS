#!/bin/bash

sudo apt update && sudo apt upgrade -y
sudo apt dist-upgrade 
sudo apt autoremove

if [! command -v vagrant -v &> /dev/null]; then
	echo "Command vagrant is not found. Install Vagrant."
	exit
fi

if [! -f ~/Downloads/LINUX.X64_193000_db_home.zip ]; then
	echo "「LINUX.X64_193000_db_home.zip」 does not exist."
fi

mkdir -p ~/Boxes
git clone https://github.com/oracle/vagrant-projects ~/Boxes/.
mv ~/Downloads/LINUX.X64_193000_db_home.zip ~/Boxes/vagrant-projects/OracleDatabase/19.3.0/.
unzip ~/Downloads/LINUX.X64_193000_db_home.zip -d ~/Boxes/vagrant-boxes/OracleDatabase/19.3.0/.
cd ~/Boxes/vagrant-projects/OracleDatabase/19.3.0/; vagrant up

echo "パスワードをメモ:"
echo "ORACLE PASSWORD FOR SYS, SYSTEM AND PDBADMIN: パスワードが表示される"
echo "--- Run 'vagrant ssh' to continue."
