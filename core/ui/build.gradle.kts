plugins {
    alias(libs.plugins.stream.android.library)
    alias(libs.plugins.stream.android.library.compose)
}

android {
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    namespace = "com.andrespengineer.core.ui"
}

dependencies {
    api(libs.androidx.metrics)
    api(projects.core.design)

    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)

    androidTestImplementation(projects.core.testing)
}
