# Copyright (C) 2026 ClearCode Inc.
# SPDX-License-Identifier: MIT

# VLP-4.0.1 does not install alsa-state on RZ/G2L while it installs it on other
# RZ/G family. We need it to implement software sound mixing.
IMAGE_INSTALL:append = " \
    packagegroup-rz-browser \
    packagegroup-rz-browser-cjk-fonts \
    alsa-state \
"
