@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

apply {
    from("$rootDir/base-module.gradle")
}

android {
    namespace = "com.btech.mylo.payment"
}

dependencies {
    implementation(project(":presentation"))
    implementation(libs.accompanist.placeholder)
}
