## Topic 1.01: Linux Installation, Virtual Machine and Container Usage 

1.01.1 Install, boot, connect, disconnect and stop Linux  
1.01.2 Concept and use of virtual machine and cotainer  
1.01.3 Boot process and systemmd  
1.01.4 Create, monitor and terminate process  
1.01.5 Use dektop environment  
#

### **1.01.3 Boot process and systemmd**
**Hardware settings**  
Settings are usually configured in either Basic Input-Output Services (BIOS) or Universal Extensible Firmware Interface (UEFI).  

BIOS Setup Utility: InsydeH20 (Swift SF313-51)
1. Information - contains CPU info, System BIOS version, HDD descriptions, product name and model.
2. Main - contains system time and date (Reduce/Increase: F5/F6), summary of installed drives.
3. Boot - contains boot mode, and boot priority order.


**Note**:
- BIOS now has a user interface, and settings stored in a non-volatile memory (NVM). NVM is a type of computer memory that can hold its data even without power. 
- A device that are unsupported or no longer commonly used by most devices are called "legacy device".


**Start and stop Linux systems**
1. shutdown (system to be powered downed)
    - shutdown or shutdown now (immediately shutdown)
    - shutdown HH:MM (shutdown 09:35 - shutdown at 9:35) 
    - shutdown -p (power off the machine)
    - shutdown -H (halt the machine)
    - shutdown -r09:35 (reboot the machine at 9:35)
    - shutdown -c (cancel shutdown command)
2. halt (instructs hardware to stop all CPU functions but leaves it powered on. Use for loe level maintenance)
    - halt
    - halt -p (power off the machine)
    - halt --reboot (reboot the machine)
3. reboot (instructs the system to restart)
    - reboot -p
    - reboot --halt
4. poweroff (sends an Advanced Configuration and Power Interface (ACPI) signal which instruct the system to power off)
    - poweroff --halt
    - poweroff --reboot


**Linux Commands for Hardware Info**  
1. lshw (list hardware)
    - info about hardware devices presenton the system (/proc file system).
    - run command as super-user.
    - sudo lshw -short (brief information)
2. lspci (list PCI) - information about PCI buses in the system
3. lsdev (list device)
    - install with "sudo apt-get install procinfo".
    - information about installed hardware.
4. lscpu (list CPU)
    - info about CPU architecture.
5. lsusb (list USB)
    - list all usb devices.
    - unable to initialize libusb: -99 (No USB controllers present)
