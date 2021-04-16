### **Useful Commands**

- **Show Password of Known Networks**
  - `$ ls /etc/NetworkManager/system-connections`
  - `$ sudo cat /etc/NetworkManager/system-connections/NETWORK_NAME`
  - Pre-Shared Key (psk) reveals the password
- **Change Directory Names JA to EN**
  - `$ LANG=C`
  - `$ xdg-user-dirs-update`
- **Create New Vim Session**
  - `$ nvim -p FILE_NAMES` 
  - `:tabdo | set splitright | vsplit INPUT.txt | vertical resize -35 | set splitbelow | split OUTPUT.txt`
  - `:mks ~/.config/nvim/session/SESSEION_NAME`
  - `$ nvim -S PATH/SESSION_NAME`
