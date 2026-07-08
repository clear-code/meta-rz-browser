# Copyright (C) 2024-2026 ClearCode Inc.
# SPDX-License-Identifier: MIT

SRC_URI:append = " \
    file://0001-omxvideodec-Start-flushing-earlier-to-avoid-unstable.patch \
"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}/:"
