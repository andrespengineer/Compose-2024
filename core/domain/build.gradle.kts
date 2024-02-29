plugins {
    alias(libs.plugins.stream.android.library)
    alias(libs.plugins.stream.android.hilt)
}

android {
    namespace = "com.andrespengineer.core.domain"
}

dependencies {
    api(projects.core.data)

    implementation(libs.javax.inject)

    testImplementation(projects.core.testing)
}