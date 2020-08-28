// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(DEPENDENCY_ANDROID_BUILD_TOOLS)
        classpath(DEPENDENCY_KOTLIN_GRADLE_PLUGIN)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks
    .withType(Delete::class.java)
    .all {
        delete(rootProject.buildDir)
    }