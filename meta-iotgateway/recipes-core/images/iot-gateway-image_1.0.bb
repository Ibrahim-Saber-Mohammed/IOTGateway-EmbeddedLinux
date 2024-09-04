require recipes-core/images/core-image-minimal.bb

SUMMARY = "simple Image recipe"
DESCRIPTION = "Recipe created by bitbake-layers inherit from the core-image-minmal and have the following features \
    * SSH , tools-debug, debug-tweaks  htop, iotop, collectd \
    * Have systemd as init process"

LICENSE = "MIT"

#SATISFY REQ[3.2]
IMAGE_FEATURES += "tools-debug \
                ssh-server-openssh"

MACHINE_FEATURES += "wifi \
                    qvga "
IOTGATEWAY_IMAGE_APPLICATIONS = " monitoring nano opensslApp"
IOTGATEWAY_IMAGE_PACKAGES     = " vsomeip rpi-play "
IOTGATEWAY_IMAGE_MONITORING   = " htop  iotop  collectd "

IMAGE_INSTALL += " packagegroup-core-ssh-openssh \
                openssh-sftp-server \
                x11vnc ${IOTGATEWAY_IMAGE_APPLICATIONS} ${IOTGATEWAY_IMAGE_PACKAGES} ${IOTGATEWAY_IMAGE_MONITORING}"                

EXTRA_IMAGE_FEATURES += "ptest-pkgs debug-tweaks"
CORE_IMAGE_EXTRA_INSTALL += "dhcp-server dhcp-client"
#integrating Qt on the Image
inherit Qt
#integrating bluetooth on the Image
inherit Bluetooth
inherit audio
