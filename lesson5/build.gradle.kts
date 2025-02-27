
plugins {
    buildlogic.`kotlin-common-conventions-no-detekt`
}

//plugins {
//    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
//    id("org.jetbrains.kotlin.jvm")
//    id("io.gitlab.arturbosch.detekt")
//}
//
//group = "ru.tbank.education.school"
//version = "0.0.1"
//
//repositories {
//    // Use Maven Central for resolving dependencies.
//    mavenCentral()
//}
//
//val archUnitVersion = "1.3.0"
//val mockkVersion = "1.13.12"
//
//dependencies {
//    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.23.6")
//    // Project structure validation
//    testImplementation("com.tngtech.archunit:archunit-junit5-api:$archUnitVersion")
//    testImplementation("com.tngtech.archunit:archunit-junit5-engine:$archUnitVersion")
//    testImplementation("com.lemonappdev:konsist:0.15.1")
//
//    // Use JUnit Jupiter for testing.
//    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
//    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
//    testImplementation("io.mockk:mockk:$mockkVersion")
////    testImplementation(platform("org.junit:junit-bom:5.10.0"))
////    testImplementation("org.junit.jupiter:junit-jupiter")
//}
//
//// Apply a specific Java toolchain to ease working on different environments.
//java {
//    toolchain {
//        languageVersion = JavaLanguageVersion.of(17)
//    }
//}
//
//tasks.named<Test>("test") {
//    // Use JUnit Platform for unit tests.
//    useJUnitPlatform()
//    jvmArgs = listOf("-Dfile.encoding=UTF-8")
//}
//
//tasks.withType<Detekt>().configureEach {
//    autoCorrect = true
//    config.setFrom(files("$rootDir/config/detekt/detekt.yml"))
//    buildUponDefaultConfig = true
//    exclude("**/Main.kt")
//    reports {
//        html.required.set(true) // observe findings in your browser with structure and code snippets
//        xml.required.set(true) // checkstyle like format mainly for integrations like Jenkins
//        txt.required.set(true) // similar to the console output, contains issue signature to manually edit baseline files
//        sarif.required.set(true) // standardized SARIF format (https://sarifweb.azurewebsites.net/) to support integrations with GitHub Code Scanning
//        md.required.set(true) // simple Markdown format
//    }
//}



val jacksonVersion = "2.18.0"
dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
    implementation("com.fasterxml.jackson.core:jackson-annotations:$jacksonVersion")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jacksonVersion")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:$jacksonVersion")
}


tasks.test {
    enabled = false
}
