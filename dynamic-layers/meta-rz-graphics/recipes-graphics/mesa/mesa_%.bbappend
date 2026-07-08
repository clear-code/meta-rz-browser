# Copyright (C) 2025-2026 ClearCode Inc.
# SPDX-License-Identifier: MIT

do_install:append() {
    if [ "${USE_MALI}" = "1" ]; then
	rm -f ${D}/${includedir}/KHR/*
    fi
}
