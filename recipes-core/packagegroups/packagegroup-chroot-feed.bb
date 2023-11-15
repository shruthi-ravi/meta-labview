SUMMARY = "Packages for feed used by LabVIEW chroot"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = "\
	packagegroup-core-buildessential \
	dropbear \
	git \
	gdb \
	libssh \
	libssh2 \
	labview \
	lv-appweb-support \
	lv-web-support \
	opencv \
	openssh \
	strace \
"
