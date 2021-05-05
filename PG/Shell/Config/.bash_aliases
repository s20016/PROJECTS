export PATH=$PATH:$HOME/.local/bin  # GL504GM, SF313-51, SF313-51U

YELLOW=$(tput setaf 3)
RED=$(tput setaf 1)
GREEN=$(tput setaf 2)
RESET=$(tput sgr 0)

# Aliases
alias sbash="source ~/.bashrc"
alias update="sudo apt update && sudo apt upgrade -y"

# Python Functions *****************************************************************************

pyrun() {
    NAME=$(uname -a | awk '{print $2}')
    USER=$(echo $USER)
    FILES=~/PROJECTS/PG/Python/Codes/*.py
    for f in $FILES; do
        if [[ ${NAME} = "GL504GM" ]]; then
            # sed -i '3,4 s/s20016/czekras/' ${f} 
            sed -i 's/s20016/czekras/g' ${f} 
        elif [[ ${NAME} = "SF313-51" ]] || [[ ${NAME} = "sf313-51u" ]]; then
            sed -i  's/czekras/s20016/g' ${f}
        fi
    done
    if [[ $1 = "p" ]]; then
        python3 ~/PROJECTS/PG/Python/Projects/P$2*.py
    else
        cat ~/PROJECTS/PG/Python/Codes/input.txt | python3 ~/PROJECTS/PG/Python/Codes/testcode$1.py \
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
        nvim -p testcode*.py +"tabdo | set splitright | vsplit input.txt | vertical resize -35 | set splitbelow | split output.txt" \
            +"mks ~/.config/nvim/session/PythonSession.vim" +qa
    fi
    for f in $FILES; do
        if [[ ${NAME} = "GL504GM" ]]; then
            sed -i 's/s20016/czekras/g' ${f} 
        elif [[ ${NAME} = "SF313-51" ]] || [[ ${NAME} = "sf313-51u" ]]; then
            sed -i 's/czekras/s20016/g' ${f}
        fi
    done
    nvim -S ~/.config/nvim/session/PythonSession.vim
}

# Java Functions *******************************************************************************

javacode() {
    VIM_SESS=~/.config/nvim/session/JavaSession.vim
    if [ ! -e "$VIM_SESS" ]; then
        cd ~/PROJECTS/PG/Java/src/codes
        nvim -p testcode*.java +"tabdo | set splitright | vsplit input.txt | vertical resize -35 | set splitbelow | split output.txt" \
            +"mks ~/.config/nvim/session/JavaSession.vim" +qa
    fi
    nvim -S ~/.config/nvim/session/JavaSession.vim
}

javarun() {
    cat ~/PROJECTS/PG/Java/src/codes/input.txt | java ~/PROJECTS/PG/Java/src/codes/testcode$1.java \
        > ~/PROJECTS/PG/Java/src/codes/output.txt
    cat ~/PROJECTS/PG/Java/src/codes/output.txt 
    echo
}

# JavaScript Functions *******************************************************************************

jscode() {
    VIM_SESS=~/.config/nvim/session/JsSession.vim
    if [ ! -e "$VIM_SESS" ]; then
        cd ~/PROJECTS/PG/JavaScript/Codes
        nvim -p testcode*.js +"tabdo | set splitright | vsplit input.txt | vertical resize -35 | set splitbelow | split output.txt" \
            +"mks ~/.config/nvim/session/JsSession.vim" +qa
    fi
    nvim -S ~/.config/nvim/session/JsSession.vim
}

jsrun() {
    cat ~/PROJECTS/PG/JavaScript/Codes/input.txt | node ~/PROJECTS/PG/JavaScript/Codes/testcode$1.js \
        > ~/PROJECTS/PG/JavaScript/Codes/output.txt
    cat ~/PROJECTS/PG/JavaScript/Codes/output.txt 
    echo
}

# Functions *******************************************************************************
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
                        vagrant ssh
                        ;;
                    *)
                        echo -e "\033[1m==> mkbox: Box Created!\033[0m"
                        ;;
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
    # Update Bash
    NAME=$(uname -a | awk '{print $2}')
    if [[ $1 = "bash" ]]; then
        cat ~/.bash_aliases > ~/PROJECTS/PG/Shell/Config/.bash_aliases
        cp ~/.config/nvim/*.vim ~/PROJECTS/PG/Shell/nvim/conf/.
        if [[ ${NAME} = "GL504GM" ]]; then
            cat /mnt/c/Users/tinio/AppData/Local/Packages/Microsoft.WindowsTerminal_8wekyb3d8bbwe/LocalState/settings.json \
                > ~/PROJECTS/PG/Shell/Config/settings.json
        fi
        echo -e "[PROJECTS]: ${YELLOW}Bash Updated!${RESET}"
        # for f in ~/PROJECTS/PG/Shell/Config/*.vim; do mv -- "$f" "${f%.vim}.txt" ; done

    # Update WordPress/cms-theme
    elif [[ $1 = "cms-theme" ]]; then
        if [[ ${NAME} ]]; then
            cp -r ~/PGLibrary/WordPress/wp-content/themes/cms-theme/* ~/PROJECTS/WebApplication/WordPress/cms-theme/.
            # rm ~/PROJECTS/WebApplication/WordPress/cms-theme/.git 
            echo -e "[PROJECTS]: ${YELLOW}cms-theme Updated!${RESET}"
        fi
    fi
}

# Function to be used ONLY by SF313-51 & SF313-51U
pull() {
    if [[ $1 = "bash" ]]; then
        read -p "Update: .bash_aliases  .config/nvim/*.vim  WinTerminal(Settings)? [Y/n] " response
        case "$response" in
            [yY][eE][sS]|[yY])
                NAME=$(uname -a | awk '{print $2}')
                VAR1="/mnt/c/Users/tinio/AppData/Local/Packages/Microsoft.WindowsTerminal_8wekyb3d8bbwe/LocalState/settings.json"
                VAR2="/mnt/c/Users/s20016/AppData/Local/Packages/Microsoft.WindowsTerminal_8wekyb3d8bbwe/LocalState/settings.json"
                # .bash configurations
                cat ~/PROJECTS/PG/Shell/Config/.bash_aliases > ~/.bash_aliases
                cat ~/PROJECTS/PG/Shell/nvim/conf/init.vim > ~/.config/nvim/init.vim
                cat ~/PROJECTS/PG/Shell/nvim/conf/local_bundles.vim > ~/.config/nvim/local_bundles.vim
                cat ~/PROJECTS/PG/Shell/nvim/conf/local_init.vim > ~/.config/nvim/local_init.vim
                # Windows Terminal setting
                if [[ ${NAME} = "GL504GM" ]]; then
                    cat ~/PROJECTS/PG/Shell/Config/settings.json > ${VAR1}
                    sed -i '11, 50 s/c6eaf9f4-32a7-5fdc-b5cf-066e8a4b1e40/2c4de342-38b7-51cf-b940-2309a097f518/' ${VAR1} 
                    sed -i '55 s/s20016/czekras/' ${VAR1}
                elif [[ ${NAME} = "SF313-51" ]]; then
                    cat ~/PROJECTS/PG/Shell/Config/settings.json > ${VAR2}
                    sed -i '11, 50 s/2c4de342-38b7-51cf-b940-2309a097f518/c6eaf9f4-32a7-5fdc-b5cf-066e8a4b1e40/' ${VAR2}
                    sed -i '55 s/czekras/s20016/' ${VAR2}
                    sed -i '55 s/Ubuntu/Ubuntu-18\.04/' ${VAR2}
                    sed -i '61 s/12/14/' ${VAR2}
                fi

                source ~/.bash_aliases && source ~/.bashrc
                echo -e "${YELLOW}Local Bash Update Complete!${RESET}"
                ;;
            *)
                echo -e "${RED}Update Canceled!${RESET}"
                ;;
        esac
    fi
}

# Adding aliases to nvim
# let $BASH_ENV = "~/.bash_aliases" <- Add to ~/.config/nvim/init.vim
shopt -s expand_aliases
