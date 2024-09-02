MACHINE_FEATURES += " bluetooth"
CORE_IMAGE_EXTRA_INSTALL = " rsync "
IMAGE_INSTALL:append = " pi-bluetooth bluez5 bluez5-testtools linux-firmware-bcm43430 i2c-tools hostapd  udev-rules-rpi bridge-utils iptables linux-firmware-ralink linux-firmware-rtl8192ce linux-firmware-rtl8192cu linux-firmware-rtl8192su linux-firmware-rpidistro-bcm43430"
ENABLE_UART = "1"