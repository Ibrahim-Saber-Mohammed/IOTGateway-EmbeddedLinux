# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bdd6ede95059016d7a51a39d5d2ed13f"

SRC_URI = "git://github.com/Ibrahim-Saber-Mohammed/CppND-System-Monitor-Project.git;protocol=https;branch=master"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "3802d9acecea755036378be295b473a0621bd5a1"

S = "${WORKDIR}/git"
DEPENDS = "ncurses"

inherit cmake pkgconfig
# # Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

