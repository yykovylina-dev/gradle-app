plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":my-lib"))
    implementation("org.apache.commons:commons-lang3:3.17.0")
}

application {
    mainClass.set("org.example.App")
}