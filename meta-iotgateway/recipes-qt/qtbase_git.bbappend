qtbase.bbappend:

EXTRA_QMAKE_CFLAGS += "-I${STAGING_DIR_NATIVE}${includedir}"

EXTRA_QMAKE_LFLAGS += "-L${STAGING_DIR_NATIVE}${libdir}"

# PACKAGECONFIG_append_pn-qtbase.

# PACKAGECONFIG:append_pn-qemu-native = " sdl"
# PACKAGECONFIG:append_pn-nativesdk-qemu = " sdl".