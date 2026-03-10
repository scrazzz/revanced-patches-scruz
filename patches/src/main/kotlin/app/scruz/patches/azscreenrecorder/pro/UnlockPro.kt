package app.scruz.patches.azscreenrecorder.pro

import app.revanced.patcher.fingerprint
import app.revanced.patcher.patch.bytecodePatch
import app.scruz.util.containsLiteralInstruction
import app.scruz.util.getReference
import app.scruz.util.indexOfFirstInstruction
import app.scruz.util.returnEarly
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

// ty nuckyz
internal val prefBoughtProductsFingerprint = fingerprint {
    returns("Z")
    custom { method, _ -> method.containsLiteralInstruction(0x7f140309) &&
            method.indexOfFirstInstruction {
                getReference<MethodReference>()?.name == "size"
            } >= 0
    }
}

@Suppress("unused")
val unlockProPatch = bytecodePatch(
    name = "Unlock Pro",
    description = "Unlock Pro video recording options",
) {
    compatibleWith("com.hecorat.screenrecorder.free"("6.4.3"))
    execute {
        prefBoughtProductsFingerprint.method.returnEarly(true)
    }
}