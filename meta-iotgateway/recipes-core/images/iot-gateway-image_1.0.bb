require recipes-core/images/core-image-minimal.bb

SUMMARY = "simple Image recipe"
DESCRIPTION = "Recipe created by bitbake-layers inherit from the core-image-minmal and have the following features \
    * SSH , tools-debug, debug-tweaks  htop, iotop, collectd \
    * Have systemd as init process"

LICENSE = "MIT"

#5GB for developement
IMAGE_ROOTFS_EXTRA_SPACE = "5242880"

#SATISFY REQ[3.2]
IMAGE_FEATURES += "tools-debug \
                ssh-server-openssh"

MACHINE_FEATURES += "wifi \
                    qvga "

IMAGE_INSTALL += "htop \
                iotop \
                collectd \
                packagegroup-core-ssh-openssh \
                openssh-sftp-server \
                vsomeip \
                nano \
                rpi-play \
                monitoring \
                x11vnc"                
EXTRA_IMAGE_FEATURES += "ptest-pkgs debug-tweaks"
CORE_IMAGE_EXTRA_INSTALL += "dhcp-server dhcp-client"
#integrating Qt on the Image
inherit Qt
#integrating bluetooth on the Image
inherit Bluetooth
inherit audio
