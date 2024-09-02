# the following to enable GStreamer or mgp123. Fot Qt Media modules GStreamer is required
IMAGE_INSTALL:append = " gstreamer1.0-plugins-good gstreamer1.0-plugins-base gstreamer1.0-plugins-bad"
LICENSE_FLAGS_ACCEPTED:append = " commercial"

PACKAGECONFIG:append:pn-qtmultimedia = " gstreamer alsa" 

# Pulseaudio is required to stream audio over Bluetooth
IMAGE_INSTALL:append = " pulseaudio pulseaudio-module-dbus-protocol pulseaudio-server pulseaudio-module-bluetooth-discover pulseaudio-module-bluetooth-policy pulseaudio-module-bluez5-device pulseaudio-module-bluez5-discover alsa-utils alsa-plugins"

