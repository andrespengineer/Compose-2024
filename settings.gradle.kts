pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "stream"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

// App
include(":app")

// Core
include(":core:common")
include(":core:data")
include(":core:database")
include(":core:design")
include(":core:domain")
include(":core:network")
include(":core:testing")
include(":core:ui")

// Feature
include(":feature:direct-messages")
include(":feature:explore")
include(":feature:preferences")
include(":feature:search")
include(":feature:video-stream")
