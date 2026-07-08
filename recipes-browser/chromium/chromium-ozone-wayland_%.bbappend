# Copyright (C) 2024, Rockchip Electronics Co., Ltd
# Copyright (C) 2025, ClearCode Inc.
# SPDX-License-Identifier: MIT

CHROMIUM_EXTRA_ARGS:append = " --enable-wayland-ime"
GN_ARGS:append = " use_system_libwayland=true "
