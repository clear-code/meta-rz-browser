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
	adwaita-icon-theme-cursors \
"
