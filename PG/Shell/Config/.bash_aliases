# =============================================================================
# Filename: ~/.bash_aliases
# Author: s20016
# Last Change: Tue 19 Oct 2021 12:20:13 PM JST
# =============================================================================

export PATH=$PATH:$HOME/.local/bin  # GL504GM, GL504GMU

# Colors
YELLOW=$(tput setaf 3)
RED=$(tput setaf 1)
GREEN=$(tput setaf 2)
RESET=$(tput sgr 0)

# Aliases
alias sbash="source ~/.bashrc"
alias update="sudo apt update && sudo apt upgrade -y"


# Python Functions *************************************************************
pyrun() {
  NAME=$(uname -a | awk '{print $2}')
  USER=$(echo $USER)
  FILES=~/PROJECTS/PG/Python/Codes/*.py
  if [[ $1 = "p" ]]; then
    python3 ~/PROJECTS/PG/Python/Projects/P$2*.py
  else
		for f in $FILES; do
			if [[ ${NAME} = "GL504GM" ]]; then
				sed -i 's/s20016/czekras/g' ${f}
			else
				sed -i 's/czekras/s20016/g' ${f}
			fi
		done
    cat ~/PROJECTS/PG/Python/Codes/input.txt | \
      python3 ~/PROJECTS/PG/Python/Codes/testcode$1.py \
      > ~/PROJECTS/PG/Python/Codes/output.txt
    cat ~/PROJECTS/PG/Python/Codes/output.txt
    echo
  fi
}

pycode() {
  NAME=$(uname -a | awk '{print $2}')
  FILES=~/PROJECTS/PG/Python/Codes/*.py
  VIM_SESS=~/.config/nvim/session/PythonSession.vim
  if [ ! -e "$VIM_SESS" ]; then
    cd ~/PROJECTS/PG/Python/Codes
    nvim -p testcode*.py +"tabdo | set splitright | vsplit input.txt | \
    vertical resize -35 | set splitbelow | split output.txt" \
      +"mks ${VIM_SESS}" +qa
  fi
  for f in $FILES; do
    if [[ ${NAME} = "GL504GM" ]]; then
      sed -i 's/s20016/czekras/g' ${f}
    else
      sed -i 's/czekras/s20016/g' ${f}
    fi
  done
  nvim -S ${VIM_SESS}
}

# Kotlin Functions *************************************************************

ktcode() {
  VIM_SESS=~/.config/nvim/session/KotlinSession.vim
  nvim -S ${VIM_SESS}
}


ktrun() {
	kotlinc ~/PROJECTS/PG/Kotlin/Codes/testcode$1.kt -include-runtime -d ~/tmp/testcode$1.jar
	java -jar ~/tmp/testcode$1.jar > ~/PROJECTS/PG/Kotlin/Codes/output.txt
	cat ~/PROJECTS/PG/Kotlin/Codes/output.txt
	echo
}

# Java Functions ***************************************************************
javacode() {
  VIM_SESS=~/.config/nvim/session/JavaSession.vim
  if [ ! -e "$VIM_SESS" ]; then
    cd ~/PROJECTS/PG/Java/src/codes
    nvim -p testcode*.java +"tabdo | set splitright | vsplit input.txt | \
    vertical resize -35 | set splitbelow | split output.txt" \
      +"mks ${VIM_SESS}" +qa
  fi
  nvim -S ${VIM_SESS}
}

javarun() {
  FIRST_ARG=$1; shift
  cat ~/PROJECTS/PG/Java/src/codes/input.txt | \
    java ~/PROJECTS/PG/Java/src/codes/testcode${FIRST_ARG}.java "$@"\
    > ~/PROJECTS/PG/Java/src/codes/output.txt
  cat ~/PROJECTS/PG/Java/src/codes/output.txt
  echo
}

# JavaScript Functions *********************************************************
jscode() {
  VIM_SESS=~/.config/nvim/session/JsSession.vim
  if [ ! -e "$VIM_SESS" ]; then
    cd ~/PROJECTS/PG/JavaScript/Codes
    nvim -p testcode*.js +"tabdo | set splitright | vsplit input.txt | \
    vertical resize -35 | set splitbelow | split output.txt" \
      +"mks ${VIM_SESS}" +qa
  fi
  nvim -S ${VIM_SESS}
}

jsrun() {
  cat ~/PROJECTS/PG/JavaScript/Codes/input.txt | \
    node ~/PROJECTS/PG/JavaScript/Codes/testcode$1.js \
    > ~/PROJECTS/PG/JavaScript/Codes/output.txt
  cat ~/PROJECTS/PG/JavaScript/Codes/output.txt
  echo
}

# Functions ********************************************************************
# Create New Vagrant Environment

mkbox() {
  DIR=~/Boxes/$1
  FILE=~/Boxes/$1/Vagrantfile
  NAME=$(uname -a | awk '{print $2}')
  if [[ ${NAME} != "GL504GM" ]]; then
    if [ ! -d "$DIR" ]; then
      mkdir ~/Boxes/$1 && cd $_
      vagrant init ubuntu/focal64
      if [ -f "$FILE" ]; then
        echo -e "\n==> mkbox: Vagrant init Success!"
        read -p "==> mkbox: Create/SSH to $1? [Y/n] " RES
        case "$RES" in
          [yY])
            vagrant up
            vagrant ssh;;
          *)
            echo -e "\033[1m==> mkbox: Box Created!\033[0m";;
        esac
      fi
    else
      echo "==> mkbox: Failed to create directory because it already exists."
    fi
  else
    echo "==> mkbox: Denied. You're in GL504GM WSL."
  fi
}

# Function to be used ONLY by GL504GM
push() {
  NAME=$(uname -a | awk '{print $2}')
	UPDATE=$(date)
	# Update Bash -> PROJECTS
  if [[ $1 = "bash" ]]; then
		sed -i "4s/:.*$/: $UPDATE/" ~/.bash_aliases
		cat ~/.bash_aliases > ~/PROJECTS/PG/Shell/Config/.bash_aliases
		# if [[ ${NAME} = "GL504GM" ]]; then
		# 	cat /mnt/c/Users/tinio/AppData/Local/Packages/Microsoft.WindowsTerminal_8wekyb3d8bbwe/LocalState/settings.json \
		# 		> ~/PROJECTS/PG/Shell/Config/settings.json
		# fi
  # Update Nvim Local -> PROJECTS
	elif [[ $1 = "nvim" ]]; then
		sed -i "4s/:.*$/: $UPDATE/" ~/.config/nvim/*.vim
    cp ~/.config/nvim/*.vim ~/PROJECTS/PG/Shell/Neovim//.

  # Update WordPress/cms-theme (Win) -> PROJECTS
  # elif [[ $1 = "cms-theme" && ${NAME} = "GL504GM" ]]; then
  #   cp -r ~/PGLibrary/WordPress/wp-content/themes/cms-theme/* \
  #     ~/PROJECTS/WebApplication/WordPress/cms-theme/.
  #   echo -e "[PROJECTS]: cms-theme Updated!"

  # Update Kotlin (Win) -> PROJECTS
  # elif [[ $1 = "kotlin" && ${NAME} = "GL504GM" ]]; then
  #   cp ~/PGLibrary/Kotlin/src/main/kotlin/*.kt ~/PROJECTS/PG/Kotlin/.
  #   echo -e "[PROJECTS]: Kotlin Updated!"
  fi
}

# Function to be used ONLY by SF313-51 & SF313-51U

pull () {
	# Bash Update PROJECTS -> local
	if [ $1 = "bash" ]; then
		cat ~/PROJECTS/PG/Shell/Config/.bash_aliases > ~/.bash_aliases
    echo -e "[LOCAL]: Bash Updated!"

	# Nvim Update PROJECTS -> Local
	elif [ $1 = "nvim" ]; then
		read -p "[LOCAL]: Update nvim with TEST CONFIG? [Y/n] " RES
		case $RES in
			[Yy])
				cp ~/PROJECTS/PG/Shell/Neovim/*.vim  ~/.config/nvim/.
				echo -e "[LOCAL]: Neovim Updated!";;
			*   ) echo -e "[LOCAL]: Update Cancelled!";;
		esac
	fi
}

# pull() {
#   if [[ $1 = "bash" ]]; then
#     read -p "Update: .bash_aliases  .config/nvim/*.vim  WinTerminal(Settings)? [Y/n] " response
#     case "$response" in
#       [yY])
#         NAME=$(uname -a | awk '{print $2}')
#         VAR1="/mnt/c/Users/tinio/AppData/Local/Packages/Microsoft.WindowsTerminal_8wekyb3d8bbwe/LocalState/settings.json"
#         VAR2="/mnt/c/Users/s20016/AppData/Local/Packages/Microsoft.WindowsTerminal_8wekyb3d8bbwe/LocalState/settings.json"
#         # .bash configurations
#         cat ~/PROJECTS/PG/Shell/Config/.bash_aliases > ~/.bash_aliases
#         cat ~/PROJECTS/PG/Shell/nvim/conf/init.vim > ~/.config/nvim/init.vim
#         cat ~/PROJECTS/PG/Shell/nvim/conf/local_bundles.vim > ~/.config/nvim/local_bundles.vim
#         cat ~/PROJECTS/PG/Shell/nvim/conf/local_init.vim > ~/.config/nvim/local_init.vim
#         # Windows Terminal setting
#         if [[ ${NAME} = "GL504GM" ]]; then
#           cat ~/PROJECTS/PG/Shell/Config/settings.json > ${VAR1}
#           sed -i '11, 50 s/c6eaf9f4-32a7-5fdc-b5cf-066e8a4b1e40/2c4de342-38b7-51cf-b940-2309a097f518/' ${VAR1}
#           sed -i '55 s/s20016/czekras/' ${VAR1}
#         elif [[ ${NAME} = "SF313-51" ]]; then
#           cat ~/PROJECTS/PG/Shell/Config/settings.json > ${VAR2}
#           sed -i '11, 50 s/2c4de342-38b7-51cf-b940-2309a097f518/c6eaf9f4-32a7-5fdc-b5cf-066e8a4b1e40/' ${VAR2}
#           sed -i '55 s/czekras/s20016/' ${VAR2}
#           sed -i '55 s/Ubuntu/Ubuntu-18\.04/' ${VAR2}
#           sed -i '61 s/12/14/' ${VAR2}
#         fi
#         echo -e "[PROJECTS]: ${YELLOW}Bash Updated!${RESET}";;
#       *)
#         echo -e "[PROJECTS]: ${RED}Update Canceled!${RESET}";;
#     esac
#   fi
# }

# Adding aliases to nvim
# let $BASH_ENV = "~/.bash_aliases" <- Add to ~/.config/nvim/init.vim
shopt -s expand_aliases
