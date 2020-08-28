plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        applicationId = "com.rebeccawu.sunnydays"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JAVA_VERSION
        targetCompatibility = JAVA_VERSION
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    packagingOptions {
        pickFirst ("META-INF/metadata.kotlin_module")
        pickFirst ("META-INF/metadata.jvm.kotlin_module")
    }

    sourceSets["main"].java.srcDir("src/main/kotlin")
    sourceSets["test"].java.srcDir("src/test/kotlin")
}

dependencies {
    implementation(project(":core"))

    implementation(DEPENDENCY_ANDROID_CONSTRAINT_LAYOUT)
    implementation(DEPENDENCY_ANDROID_KTX_FRAGMENT)
    implementation(DEPENDENCY_ANDROID_LIFECYCLE_VIEW_MODEL)
    implementation(DEPENDENCY_ANDROID_LIFECYCLE_LIVE_DATA)
    implementation(DEPENDENCY_ANDROID_MATERIAL)
    implementation(DEPENDENCY_ANDROID_RECYCLERVIEW)
    implementation(DEPENDENCY_ANDROID_X_CORE_KTX)
    implementation(DEPENDENCY_DAGGER)
    implementation(DEPENDENCY_DAGGER_ANDROID)
    implementation(DEPENDENCY_DAGGER_ANDROID_SUPPORT)
    kapt(DEPENDENCY_DAGGER_ANDROID_ANNOTATION_PROCESSOR)
    kapt(DEPENDENCY_DAGGER_ANNOTATION_PROCESSOR)
    implementation(DEPENDENCY_GLIDE)
    implementation(DEPENDENCY_KOTLIN_STD_LIB)
    implementation(DEPENDENCY_OK_HTTP_LOGGING_INTERCEPTOR)
    implementation(DEPENDENCY_RETROFIT)
    implementation(DEPENDENCY_RETROFIT_ADAPTER_RX)
    implementation(DEPENDENCY_RETROFIT_CONVERTER_MOSHI)
    implementation(DEPENDENCY_RX_ANDROID)
    implementation(DEPENDENCY_ANDROID_SWIPE_REFRESH_LAYOUT)

    testImplementation(DEPENDENCY_JUNIT)
    testImplementation(DEPENDENCY_KOTEST)
    testImplementation(DEPENDENCY_KOTEST_ASSERTIONS)
    testImplementation(DEPENDENCY_MOCKK)
}