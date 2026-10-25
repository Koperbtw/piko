/*
 * Copyright (C) 2026 piko <https://github.com/crimera/piko>
 *
 * See the included NOTICE file for GPLv3 §7(b) terms that apply to this code.
 */

package app.crimera.patches.instagram.misc.reels

import app.crimera.patches.instagram.misc.hookFlags.hookFlagsPatch
import app.crimera.patches.instagram.misc.settings.settingsPatch
import app.crimera.patches.instagram.utils.Constants.COMPATIBILITY_INSTAGRAM
import app.crimera.patches.instagram.utils.enableSettings
import app.morphe.patcher.patch.bytecodePatch

@Suppress("unused")
val disableReelsAutoScrollPatch = bytecodePatch(
    name = "Disable Reels auto-scroll",
    description = "Disables the option to auto-scroll Reels.",
) {
    compatibleWith(COMPATIBILITY_INSTAGRAM)

    dependsOn(settingsPatch, hookFlagsPatch)

    execute {
        enableSettings("disableReelsAutoScroll")
    }
}
