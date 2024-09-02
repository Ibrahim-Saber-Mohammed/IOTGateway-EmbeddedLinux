DESCRIPTION = ""
HOMEPAGE = ""
LICENSE = ""
SRC_URI = "file://opensslApp.cpp"

# Modify these as desired
S = "${WORKDIR}/source"
DEPENDS = "openssl "

do_compile(){
    ${CXX} ${S}/opensslApp.cpp -lcrypto -lssl -o mySslApp
}

do_install(){
    install -d ${D}/${bindir} 
    install -m 0755 mySslApp ${D}/${bindir} 
}
