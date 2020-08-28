import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("java-library")
    id("kotlin")
    id("kotlin-kapt")
}

dependencies {
    implementation(DEPENDENCY_KOTLIN_STD_LIB)
    implementation(DEPENDENCY_MOSHI_KOTLIN)
    kapt(DEPENDENCY_MOSHI_KOTLIN_CODEGEN)
    implementation(DEPENDENCY_RETROFIT)
    implementation(DEPENDENCY_RX2)

    testImplementation(DEPENDENCY_JUNIT)
    testImplementation(DEPENDENCY_MOCKK)
}

sourceSets["main"].java.srcDir("src/main/kotlin")
sourceSets["test"].java.srcDir("src/test/kotlin")

repositories {
    mavenCentral()
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}