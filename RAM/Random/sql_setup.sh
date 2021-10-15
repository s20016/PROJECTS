#!/bin/bash

# Setting prerequisites
vagrantbox_is_installed=true
virtualbox_is_installed=true
oracleSQl_is_downloaded=true
all_set=true

# Setting variables
oracleSQL_path=$(find $HOME -type f -name LINUX.X64_193000_db_home.zip | head -1)

# Checking prerequisites
if [[ ! -f $oracleSQL_path ]]; then
	oracleSQl_is_downloaded=false; all_set=false
fi

if ! [ -x "$(command -v vagrant)" ]; then
	vagrantbox_is_installed=false; all_set=false
fi

if ! [ -x "$(command -v VBoxManage)" ]; then
	virtualbox_is_installed=false; all_set=false
fi

# Confirming prerequisites
if [ "$vagrantbox_is_installed" == true ]; then
	echo " [ OK ]: Vagrant"
else
	echo " [ NG ]: Vagrant"
fi

if [ "$virtualbox_is_installed" == true ]; then
	echo " [ OK ]: VBoxManager"
else 
	echo " [ NG ]: VBoxManager"
fi

if [ "$oracleSQl_is_downloaded" == true ]; then
	echo -e " [ OK ]: LINUX.X64_193000_db_home.zip\n"
else 
	echo -e " [ NG ]: LINUX.X64_193000_db_home.zip\n"
fi

if [ "$all_set" == true ]; then
	# echo -e " [ OK ]: Files Complete\n"
	read -p " You're all set. Continue? [Y/n]: " RES
else
	# echo -e " [ NG ]: Files Incomplete\n"
	echo " Please install/download the files. Aborting..."
	exit
fi

# Main Installation
if [[ ${RES,,} == "y" ]]; then
	echo " Commencing..."

	sudo apt update

	# Directory for vagrant boxes
	mkdir -p $HOME/Boxes/

	# Cloning vagrant-projects from Oracle
	if [ ! -d "$HOME/Boxes/vagrant-projects" ]; then
		git clone https://github.com/oracle/vagrant-projects.git $HOME/Boxes/.
	fi

	oracle_vagrant="$HOME/Boxes/vagrant-projects/OracleDatabase/19.3.0/"
	# vagrant global-status | awk '/oracle-19c-vagrant/ {print $1}'

	cd $oracle_vagrant
	cp $oracleSQL_path ./.
	unzip $oracle_vagrant -d ./.
	vagrant up

else
	echo " Aborting..."
fi

