plugins {
    alias(libs.plugins.stream.android.library)
    alias(libs.plugins.stream.android.hilt)
}

android {
    namespace = "com.andrespengineer.feature.video_stream"
}

dependencies {
    testImplementation(projects.core.testing)
    androidTestImplementation(projects.core.testing)
}