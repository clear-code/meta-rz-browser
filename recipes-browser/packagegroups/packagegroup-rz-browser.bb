# Copyright (C) 2026 ClearCode Inc.
# SPDX-License-Identifier: MIT

SUMMARY = "Essential packages for web browsers on Renesas RZ platforms"
DESCRIPTION = " \
  Installs the runtime packages commonly required for web browsers on Renesas \
  RZ platforms. The current implementation is based on Chromium. \
"

inherit packagegroup

PACKAGES = "\
	${PN} \
"

RDEPENDS:${PN} = "\
	chromium-ozone-wayland \
	chromiumpolicy \
	adwaita-icon-theme-cursors \
"
