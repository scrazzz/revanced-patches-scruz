# 👋🧩 ReVanced Patches by scruz

![GitHub Workflow Status (with event)](https://img.shields.io/github/actions/workflow/status/ReVanced/revanced-patches-template/release.yml)
![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)



## ❓ About

Available patches:
- AZ Screen Recorder

## 🚀 Get started

To start using this template, follow these steps:

1. [Create a new repository using this template](https://github.com/new?template_name=revanced-patches-template&template_owner=ReVanced)
2. Set up the [build.gradle.kts](patches/build.gradle.kts) file (Specifically, the [group of the project](patches/build.gradle.kts#L1),
and the [About](patches/build.gradle.kts#L5-L11))
3. Update dependencies in the [libs.versions.toml](gradle/libs.versions.toml) file
4. [Create a pass-phrased GPG master key and subkey](https://mikeross.xyz/create-gpg-key-pair-with-subkeys/)
5. Add the following GitHub secrets:
   1. [GPG_PRIVATE_KEY](.github/workflows/release.yml#L52): The ASCII-armored GPG key
   2. [GPG_PASSPHRASE](.github/workflows/release.yml#L53): The passphrase for the GPG key
6. Add the following GitHub variables:
   1. [GPG_FINGERPRINT](.github/workflows/release.yml#L54): The fingerprint of the GPG key
7. Set up the [README.md](README.md) file[^1] (e.g, title, description, license, summary of the patches
that are included in the repository), the [issue templates](.github/ISSUE_TEMPLATE)[^2]  and the [contribution guidelines](CONTRIBUTING.md)[^3]

🎉 You are now ready to start creating patches!

[^1]: [Example README.md file](https://github.com/ReVanced/revanced-patches/blob/main/README.md)
[^2]: [Example issue templates](https://github.com/ReVanced/revanced-patches/tree/main/.github/ISSUE_TEMPLATE)
[^3]: [Example contribution guidelines](https://github.com/ReVanced/revanced-patches/blob/main/CONTRIBUTING.md)

## 🔘 Optional steps

You can also add the following things to the repository:

- API documentation, if you want to publish your patches as a library

## 🧑‍💻 Usage

To develop and release ReVanced Patches using this template, some things need to be considered:

- Development starts in feature branches. Once a feature branch is ready, it is squashed and merged into the `dev` branch
- The `dev` branch is merged into the `main` branch once it is ready for release
- Semantic versioning is used to version ReVanced Patches. ReVanced Patches have a public API for other patches to use
- Semantic commit messages are used for commits
- Commits on the `dev` branch and `main` branch are automatically released
via the [release.yml](.github/workflows/release.yml) workflow, which is also responsible for generating the changelog
and updating the version of ReVanced Patches. It is triggered by pushing to the `dev` or `main` branch.
The workflow uses the `publish` task to publish the release of ReVanced Patches
- The `buildAndroid` task is used to build ReVanced Patches so that it can be used on Android.
The `publish` task depends on the `buildAndroid` task, so it will be run automatically when publishing a release.

## 📚 Everything else

### 📙 Contributing

Thank you for considering contributing to ReVanced Patches template.  
You can find the contribution guidelines [here](CONTRIBUTING.md).

### 🛠️ Building

To build ReVanced Patches template,
you can follow the [ReVanced documentation](https://github.com/ReVanced/revanced-documentation).

## 📜 License

ReVanced Patches template is licensed under the GPLv3 license.
Please see the [license file](LICENSE) for more information.
[tl;dr](https://www.tldrlegal.com/license/gnu-general-public-license-v3-gpl-3) you may copy, distribute
and modify ReVanced Patches template as long as you track changes/dates in source files.
Any modifications to ReVanced Patches template must also be made available under the GPL,
along with build & install instructions.
