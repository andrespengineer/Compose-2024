plugins {
    alias(libs.plugins.stream.android.library)
    alias(libs.plugins.stream.android.library.compose)
    alias(libs.plugins.stream.android.hilt)
}

android {
    namespace = "com.andrespengineer.core.testing"
}

dependencies {
    api(kotlin("test"))
    api(libs.androidx.compose.ui.test)
    api(projects.core.data)

    debugApi(libs.androidx.compose.ui.testManifest)

    implementation(libs.accompanist.testharness)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.test.rules)
    implementation(libs.hilt.android.testing)
    implementation(libs.kotlinx.coroutines.test)
    implementation(libs.kotlinx.datetime)
    implementation(libs.robolectric.shadows)
    implementation(projects.core.common)
    implementation(projects.core.design)
}