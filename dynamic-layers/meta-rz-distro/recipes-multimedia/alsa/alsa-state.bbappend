FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

ASOUND_CONF = "asound.conf"
ASOUND_CONF:smarc-rzg2l = "asound.conf.smarc-rzg2l"

SRC_URI:append = " \
    file://${ASOUND_CONF} \
"

do_install:append() {
    install -d ${D}/${sysconfdir}
    install -m 0644 ${WORKDIR}/${ASOUND_CONF} ${D}/${sysconfdir}/asound.conf
}
