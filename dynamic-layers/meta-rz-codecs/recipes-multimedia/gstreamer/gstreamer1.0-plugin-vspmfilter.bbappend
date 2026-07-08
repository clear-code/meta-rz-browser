# Copyright (C) 2025-2026 ClearCode Inc.
# SPDX-License-Identifier: MIT

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-Increase-MAX_BUFFERS.patch"

ERROR_QA:remove = "patch-fuzz"
