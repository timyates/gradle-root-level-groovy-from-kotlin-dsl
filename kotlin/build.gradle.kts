plugins {
    java
    application
}

repositories {
    mavenCentral()
}

val library: groovy.lang.Closure<String> by rootProject.extra

dependencies {
    implementation(project(":groovy"))
    implementation(library("shared"))
}

application.mainClass.set("test.B")