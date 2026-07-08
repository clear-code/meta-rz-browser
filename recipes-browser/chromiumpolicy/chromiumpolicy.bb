# Copyright (C) 2026 ClearCode Inc.
# SPDX-License-Identifier: MIT

SUMMARY = "Chromium managed policy for embedded systems"
DESCRIPTION = "Installs Chromium managed policy defaults suitable for embedded systems."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://embedded_policy.json"

S = "${WORKDIR}"

inherit allarch

do_install() {
    install -d ${D}${sysconfdir}/chromium/policies/managed
    install -m 0644 ${WORKDIR}/embedded_policy.json \
        ${D}${sysconfdir}/chromium/policies/managed/
}

FILES:${PN} = "${sysconfdir}/chromium/policies/managed/*"
