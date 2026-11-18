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

// Запуск приложения переносим в модуль app,
// поэтому здесь блок application { ... } не нужен