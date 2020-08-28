import org.gradle.api.JavaVersion

//AndroidX
const val DEPENDENCY_ANDROID_BUILD_TOOLS = "com.android.tools.build:gradle:4.0.1"
const val DEPENDENCY_ANDROID_X_CORE_KTX = "androidx.core:core-ktx:1.3.1"

//Dagger
private const val DAGGER_VERSION = "2.16"
const val DEPENDENCY_DAGGER: String = "com.google.dagger:dagger:$DAGGER_VERSION"
const val DEPENDENCY_DAGGER_ANDROID: String = "com.google.dagger:dagger-android:$DAGGER_VERSION"
const val DEPENDENCY_DAGGER_ANDROID_ANNOTATION_PROCESSOR: String = "com.google.dagger:dagger-android-processor:$DAGGER_VERSION"
const val DEPENDENCY_DAGGER_ANDROID_SUPPORT: String = "com.google.dagger:dagger-android-support:$DAGGER_VERSION"
const val DEPENDENCY_DAGGER_ANNOTATION_PROCESSOR: String = "com.google.dagger:dagger-compiler:$DAGGER_VERSION"

//Glide
const val GLIDE_VERSION = "4.11.0"
const val DEPENDENCY_GLIDE = "com.github.bumptech.glide:glide:$GLIDE_VERSION"

//Java
val JAVA_VERSION = JavaVersion.VERSION_1_8

//JUnit
const val DEPENDENCY_JUNIT: String = "junit:junit:4.13"

//Kotlin
private const val KOTLIN_VERSION = "1.3.72"
const val DEPENDENCY_KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
const val DEPENDENCY_KOTLIN_STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$KOTLIN_VERSION"

//Kotest
private const val KOTEST_VERSION = "4.1.3"
const val DEPENDENCY_KOTEST = "io.kotest:kotest-runner-junit5-jvm:$KOTEST_VERSION"
const val DEPENDENCY_KOTEST_ASSERTIONS = "io.kotest:kotest-assertions-core-jvm:$KOTEST_VERSION"

//Lifecycle
private const val ANDROID_LIFECYCLE_VERSION = "2.2.0"
const val DEPENDENCY_ANDROID_LIFECYCLE_LIVE_DATA: String = "androidx.lifecycle:lifecycle-livedata-ktx:$ANDROID_LIFECYCLE_VERSION"
const val DEPENDENCY_ANDROID_LIFECYCLE_VIEW_MODEL: String = "androidx.lifecycle:lifecycle-viewmodel-ktx:$ANDROID_LIFECYCLE_VERSION"

//MockK
private const val VERSION_MOCKK = "1.9.3"
const val DEPENDENCY_MOCKK: String = "io.mockk:mockk:$VERSION_MOCKK"

//Moshi
private const val MOSHI_VERSION = "1.9.3"
const val DEPENDENCY_MOSHI_KOTLIN: String = "com.squareup.moshi:moshi-kotlin:$MOSHI_VERSION"
const val DEPENDENCY_MOSHI_KOTLIN_CODEGEN: String = "com.squareup.moshi:moshi-kotlin-codegen:$MOSHI_VERSION"

//Retrofit
private const val OK_HTTP_VERSION = "4.7.2"
private const val RETROFIT_VERSION = "2.9.0"
const val DEPENDENCY_OK_HTTP_LOGGING_INTERCEPTOR: String = "com.squareup.okhttp3:logging-interceptor:$OK_HTTP_VERSION"
const val DEPENDENCY_RETROFIT: String = "com.squareup.retrofit2:retrofit:$RETROFIT_VERSION"
const val DEPENDENCY_RETROFIT_ADAPTER_RX: String = "com.squareup.retrofit2:adapter-rxjava2:$RETROFIT_VERSION"
const val DEPENDENCY_RETROFIT_CONVERTER_MOSHI: String = "com.squareup.retrofit2:converter-moshi:$RETROFIT_VERSION"

//RxJava
const val DEPENDENCY_RX2: String = "io.reactivex.rxjava2:rxjava:2.2.15"
const val DEPENDENCY_RX_ANDROID: String = "io.reactivex.rxjava2:rxandroid:2.0.2"

//Views
private const val ANDROID_FRAGMENT_VERSION: String = "1.2.5"
private const val ANDROID_RECYCLERVIEW_VERSION: String = "1.1.0"
private const val ANDROID_SWIPE_REFRESH_VERSION: String = "1.1.0"
const val DEPENDENCY_ANDROID_CONSTRAINT_LAYOUT: String = "androidx.constraintlayout:constraintlayout:1.1.3"
const val DEPENDENCY_ANDROID_KTX_FRAGMENT: String = "androidx.fragment:fragment-ktx:$ANDROID_FRAGMENT_VERSION"
const val DEPENDENCY_ANDROID_MATERIAL: String = "com.google.android.material:material:1.1.0-rc02"
const val DEPENDENCY_ANDROID_RECYCLERVIEW: String = "androidx.recyclerview:recyclerview:$ANDROID_RECYCLERVIEW_VERSION"
const val DEPENDENCY_ANDROID_SWIPE_REFRESH_LAYOUT: String = "androidx.swiperefreshlayout:swiperefreshlayout:$ANDROID_SWIPE_REFRESH_VERSION"