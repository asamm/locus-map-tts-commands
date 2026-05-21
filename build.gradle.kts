plugins {
    id("com.android.library")
    `maven-publish`
}

android {
    namespace = "com.asamm.android.library.ttsCommands"
    compileSdk = 36

    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    // Expose only the release variant; JitPack picks this up automatically.
    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
}

// JitPack serves this as `com.github.asamm:locus-map-tts-commands:<git-tag>`
// and overrides version from the tag at build time. The defaults below exist so
// `./gradlew publishToMavenLocal` works locally without any -P flags.
group = "com.github.asamm"
version = "0.1.0"

afterEvaluate {
    publishing {
        publications {
            register<MavenPublication>("release") {
                from(components["release"])
                groupId = project.group.toString()
                artifactId = "locus-map-tts-commands"
                version = project.version.toString()
            }
        }
    }
}
