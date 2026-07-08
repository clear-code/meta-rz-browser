# Copyright (C) 2026 ClearCode Inc.
# SPDX-License-Identifier: MIT

SUMMARY = "Recommended CJK fonts for web browsers on Renesas RZ platforms"
DESCRIPTION = " \
  Installs Source Han Sans fonts for Simplified Chinese, Traditional Chinese, \
  Japanese, and Korean to improve multilingual text rendering in web browser \
  environment. \
"

inherit packagegroup

PACKAGES = "\
	${PN} \
"

RDEPENDS:${PN} = "\
        source-han-sans-cn-fonts \
        source-han-sans-jp-fonts \
        source-han-sans-kr-fonts \
        source-han-sans-tw-fonts \
"
