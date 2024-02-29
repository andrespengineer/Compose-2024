import com.andrespengineer.build_logic.convention.base.StreamBuildType

plugins {
    alias(libs.plugins.stream.android.application)
    alias(libs.plugins.stream.android.application.compose)
    alias(libs.plugins.stream.android.hilt)
}

android {
    defaultConfig {
        applicationId = "com.andrespengineer.stream"
        versionCode = 1
        versionName = "1.0.0"

        // Custom test runner to set up Hilt dependency graph
        testInstrumentationRunner = "com.andrespengineer.stream.core.testing.StreamTestRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug {
            applicationIdSuffix = StreamBuildType.DEBUG.applicationIdSuffix
        }
        val release = getByName("release") {
            isMinifyEnabled = true
            applicationIdSuffix = StreamBuildType.RELEASE.applicationIdSuffix
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )

            // To publish on the Play store a private signing key is required, but to allow anyone
            // who clones the code to sign and run the release variant, use the debug signing key.
            // TODO: Abstract the signing configuration to a separate file to avoid hardcoding this.
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
    namespace = "com.andrespengineer.stream"
}

dependencies {
    implementation(projects.feature.directMessages)
    implementation(projects.feature.explore)
    implementation(projects.feature.preferences)
    implementation(projects.feature.search)
    implementation(projects.feature.videoStream)

    implementation(projects.core.ui)
    implementation(projects.core.design)
    implementation(projects.core.data)
    implementation(projects.core.common)

    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.compose.material3.windowSizeClass)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.kotlinx.coroutines.guava)
    implementation(libs.coil.kt)

    debugImplementation(libs.androidx.compose.ui.testManifest)

    kspTest(libs.hilt.compiler)

    testImplementation(projects.core.testing)
    testImplementation(libs.accompanist.testharness)
    testImplementation(libs.hilt.android.testing)
    testImplementation(libs.work.testing)

    androidTestImplementation(projects.core.testing)
    androidTestImplementation(libs.androidx.navigation.testing)
    androidTestImplementation(libs.accompanist.testharness)
    androidTestImplementation(libs.hilt.android.testing)
}