import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    val kotlinVersion = "1.2.71"
    extra["kotlinVersion"] = kotlinVersion

    val springBootVersion = "2.1.5.RELEASE"
    extra["springBootVersion"] = springBootVersion

    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
        classpath(kotlin("gradle-plugin", version = kotlinVersion))
    }
}

apply {
    plugin("org.flywaydb.flyway")
    plugin("kotlin")
    plugin("org.springframework.boot")
}

plugins {
    idea
    application
    id("org.springframework.boot") version "2.1.5.RELEASE"
    id("io.spring.dependency-management") version "1.0.7.RELEASE"
    id( "org.flywaydb.flyway") version "4.0.3"
    kotlin("jvm") version "1.2.71"
    kotlin("plugin.spring") version "1.2.71"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    jcenter()
    maven { setUrl("http://repository.jetbrains.com/all/")}
}

flyway {
    url = "jdbc:mysql://127.0.0.1:3306/dev"
    user = "user"
    password = "password"
}

val kotlinVersion = extra["kotlinVersion"] as String
val springBootVersion = extra["springBootVersion"] as String

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    compileOnly("org.springframework.boot:spring-boot-devtools")
    compile("mysql:mysql-connector-java")
    compile("org.flywaydb:flyway-core:4.0.3")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}
