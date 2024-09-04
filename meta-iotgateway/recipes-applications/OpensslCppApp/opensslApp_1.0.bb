DESCRIPTION = ""
HOMEPAGE = ""
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRC_URI = "file://opensslApp.cpp"

# Modify these as desired
DEPENDS = "openssl "
# add debugging information to the binaries
CXXFLAGS:append = " -g " 
do_compile(){
    ${CXX} ${CXXFLAGS} ${WORKDIR}/opensslApp.cpp -lcrypto -lssl -o mySslApp
}

do_install(){
    install -d ${D}/${bindir} 
    install -m 0755 mySslApp ${D}/${bindir} 
}
