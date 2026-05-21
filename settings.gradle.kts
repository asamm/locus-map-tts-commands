pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        // Keep AGP/Kotlin versions in sync with the parent locus-core build
        // (gradle/libs.versions.toml: androidGradle, kotlin).
        id("com.android.library") version "9.1.1"
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "locus-map-tts-commands"
