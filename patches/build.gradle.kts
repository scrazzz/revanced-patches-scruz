group = "app.sruz"

patches {
    about {
        name = "scruz's ReVanced Patches"
        description = "Patches for ReVanced by scruz"
        source = "git@github.com:revanced/revanced-patches-template.git"
        author = "scruz"
        contact = "@scruzism on discord"
        website = "https://revanced.app"
        license = "GNU General Public License v3.0"
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xcontext-receivers")
//        freeCompilerArgs.add("-Xcontext-parameters")
    }
}
