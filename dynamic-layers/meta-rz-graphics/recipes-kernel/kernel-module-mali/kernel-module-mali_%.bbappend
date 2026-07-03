FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

python () {
    import bb.utils
    if bb.utils.vercmp_string(d.getVar('PV'), "2.0.1") == 0:
        patches = [
            "file://0001-Avoiding-infinite-retry-on-rejected-VMA-gaps.patch;patchdir=../../../..",
            "file://0001-mali_kbase-improve-gap-search-in-kbase_unmapped_area.patch;patchdir=../../../..",
        ]
        d.appendVar('SRC_URI', ' ' + ' '.join(patches))
}
