## Topic 101: System Architecture

101.1 Determine and configure hardware settings  
101.2 Boot the System  
101.3 Change runlevels and boot target, and shutdown or reboot system  
#

### 101.1 Determine and configure hardware settings  
**Hardware settings**  
Settings are usually configured in either Basic Input-Output Services (BIOS) or Universal Extensible Firmware Interface (UEFI).  

BIOS Setup Utility: InsydeH20 (Swift SF313-51)
1. Information - contains CPU info, System BIOS version, HDD descriptions, product name and model.
2. Main - contains system time and date (Reduce/Increase: F5/F6), summary of installed drives.
3. Boot - contains boot mode, and boot priority order.


Note:
- BIOS now has a user interface, and settings stored in a non-volatile memory (NVM). NVM is a type of computer memory that can hold its data even without power. 
- A device that are unsupported or no longer commonly used by most devices are called "legacy device".


**Mass storage devices**
- Diskettes or floppy disks (~5MB)
- CD, DVD, Blue-Ray Drives
- Flash or thumb drives (1GB-1TB)
- Hard disk drive (HDD)
- Solid-state drives (SSD)


**Coldplug vs. Hotplug**  
Coldplug devices should only be removed when the computer power is off.
- Random-access Memory (RAM)
- Central Processing Unit (CPU)
- Peripheral Component Interconnect (PCI)
- Hard disk drives

Hotplug devices can be removed while the computer power is on.
- Universal Serial Bus (USB) drives
- FireWire devices


**Filesystem Hierarchy:**
1. /dev - contains mostly device files. 
2. /proc - provides running processes including kernel processes.
3. /sys - constains information and configuration settings about devices, drivers and some kernel features.

Note: 
- Virtual files are built from scratch every reboot. It exists in RAM and disappears when power is off.

Linux uses the following components to manage devices:  
1. sysfs - A virtual filesystem mounted at /sys which exports information about hotplug devices so that other utilities can access the information. 
2. /udev - A virtual filesystem that creates device files as devices are added and removed. 
3. Desktop Bus (D-Bus) daemon - Allows process to communicate with each other and notify them of new hotplug devices.
