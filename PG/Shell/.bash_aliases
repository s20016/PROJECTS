export PATH=$PATH:$HOME/.local/bin  # GL504GM, SF313-51, SF313-51U

# Aliases
alias sbash="source ~/.bashrc"
alias update="sudo apt update && sudo apt upgrade -y"

# Functions

# Python Functions *****************************************************************************

pyrun() {
    NAME=$(uname -a | awk '{print $2}')
    FILES=~/PROJECTS/PG/Python/Codes/*.py
    USER=$(echo $USER)
    for f in $FILES; do
        if [[ ${NAME} = "GL504GM" ]]; then
            sed -i '3,4 s/s20016/czekras/' ${f} 
        elif [[ ${NAME} = "SF313-51" ]]; then
            sed -i '3,4 s/czekras/s20016/' ${f}
        fi
    done
    cat ~/PROJECTS/PG/Python/Codes/input.txt | python3 ~/PROJECTS/PG/Python/Codes/testcode$1.py \
        > ~/PROJECTS/PG/Python/Codes/output.txt
    cat ~/PROJECTS/PG/Python/Codes/output.txt
    echo
}

pycode() {
    NAME=$(uname -a | awk '{print $2}')
    FILES=~/PROJECTS/PG/Python/Codes/*.py
    USER=$(echo $USER)
    for f in $FILES; do
        if [[ ${NAME} = "GL504GM" ]]; then
            sed -i '3,4 s/s20016/czekras/' ${f} 
        elif [[ ${NAME} = "SF313-51" ]]; then
            sed -i '3,4 s/czekras/s20016/' ${f}
        fi
    done
    nvim -S ~/.config/nvim/session/PythonSession.vim
}

# Java Functions *******************************************************************************

javacode() {
    nvim -S ~/.config/nvim/session/JavaSession.vim
}

javarun() {
#   if [[ ${1} = "w" ]]; then
#       java ~/PROJECTS/PG/Java/src/Codes/testcode$2.java > ~/PROJECTS/PG/Java/src/Codes/output.txt \
#           cat ~/PROJECTS/PG/Java/src/Codes/output.txt
#       echo
#   elif [[ ${1} = "rw" ]]; then
#       cat ~/PROJECTS/PG/Java/src/Codes/input.txt | java ~/PROJECTS/PG/Java/src/Codes/testcode$2.java \
#           > ~/PROJECTS/PG/Java/src/Codes/output.txt
#       cat ~/PROJECTS/PG/Java/src/Codes/output.txt
#       echo
#   fi
   cat ~/PROJECTS/PG/Java/src/Codes/input.txt | java ~/PROJECTS/PG/Java/src/Codes/testcode$1.java \
       > ~/PROJECTS/PG/Java/src/Codes/output.txt
   cat ~/PROJECTS/PG/Java/src/Codes/output.txt 
   echo
}

# Nvim Functions *******************************************************************************

# Function to be used ONLY by GL504GM
pushbash() {
    NAME=$(uname -a | awk '{print $2}')
    cat ~/.bash_aliases > ~/PROJECTS/PG/Shell/.bash_aliases
    cp ~/.config/nvim/*.vim ~/PROJECTS/PG/Shell/
    if [[ ${NAME} = "GL504GM" ]]; then
        cat /mnt/c/Users/tinio/AppData/Local/Packages/Microsoft.WindowsTerminal_8wekyb3d8bbwe/LocalState/settings.json \
            > ~/PROJECTS/PG/Shell/settings.json
    fi
    # for f in ~/PROJECTS/PG/Shell/*.vim; do mv -- "$f" "${f%.vim}.txt" ; done
}

# Function to be used ONLY by SF313-51 & SF313-51U
pullbash() {
    read -p "Update: .bash_aliases  .config/nvim/*.vim  WinTerminal(Settings)? [Y/n] " response
    case "$response" in
        [yY][eE][sS]|[yY])
            NAME=$(uname -a | awk '{print $2}')
            VAR1="/mnt/c/Users/tinio/AppData/Local/Packages/Microsoft.WindowsTerminal_8wekyb3d8bbwe/LocalState/settings.json"
            VAR2="/mnt/c/Users/s20016/AppData/Local/Packages/Microsoft.WindowsTerminal_8wekyb3d8bbwe/LocalState/settings.json"
            cat ~/PROJECTS/PG/Shell/.bash_aliases > ~/.bash_aliases
            cat ~/PROJECTS/PG/Shell/init.vim > ~/.config/nvim/init.vim
            cat ~/PROJECTS/PG/Shell/local_bundles.vim > ~/.config/nvim/local_bundles.vim
            cat ~/PROJECTS/PG/Shell/local_init.vim > ~/.config/nvim/local_init.vim
            if [[ ${NAME} = "GL504GM" ]]; then
                cat ~/PROJECTS/PG/Shell/settings.json > ${VAR1}
                sed -i '11, 50 s/c6eaf9f4-32a7-5fdc-b5cf-066e8a4b1e40/2c4de342-38b7-51cf-b940-2309a097f518/' ${VAR1} 
                sed -i '55 s/s20016/czekras/' ${VAR1}
            elif [[ ${NAME} = "SF313-51" ]]; then
                cat ~/PROJECTS/PG/Shell/settings.json > ${VAR2}
                sed -i '11, 50 s/2c4de342-38b7-51cf-b940-2309a097f518/c6eaf9f4-32a7-5fdc-b5cf-066e8a4b1e40/' ${VAR2}
                sed -i '55 s/czekras/s20016/' ${VAR2}
                sed -i '55 s/Ubuntu/Ubuntu-18\.04/' ${VAR2}
                sed -i '61 s/12/13/' ${VAR2}
            fi
            source ~/.bash_aliases && source ~/.bashrc
            echo Update Complete!
            ;;
        *)
            echo Update Canceled!
            ;;
    esac
}

# Adding aliases to nvim
# let $BASH_ENV = "~/.bash_aliases" <- Add to ~/.config/nvim/init.vim
shopt -s expand_aliases
