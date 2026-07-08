# Copyright (C) 2026 ClearCode Inc.
# SPDX-License-Identifier: MIT

SUMMARY = "Project Tanzanite web content for Project GEM"
DESCRIPTION = "Sample demo contents for Project GEM (Gecko Embedded)"
HOMEPAGE = "https://github.com/gem-tanzanite/gem-tanzanite.github.io"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e937e975a7aed3cc67d2918586d2b8d6"

SRC_URI = "\
    git://github.com/gem-tanzanite/gem-tanzanite.github.io.git;protocol=https;branch=main \
    file://gem-tanzanite \
"
SRCREV = "e335e7d4e908da5f867f6257af480cf8d073d261"

S = "${WORKDIR}/git"

inherit allarch

do_install() {
    install -d ${D}${datadir}/gem-tanzanite
    cp -R --no-dereference --preserve=mode,links ${S}/. ${D}${datadir}/gem-tanzanite/
    rm -rf ${D}${datadir}/gem-tanzanite/.git

    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/gem-tanzanite ${D}${bindir}/gem-tanzanite
}

FILES:${PN} = "\
    ${datadir}/gem-tanzanite \
    ${bindir}/gem-tanzanite \
"

RDEPENDS:${PN} += "\
    chromium-ozone-wayland \
    python3-core \
    python3-netserver \
"
