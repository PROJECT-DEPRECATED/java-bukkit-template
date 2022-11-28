import java.nio.charset.StandardCharsets

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = property("plugin_group")!!
version = property("plugin_version")!!

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly(dependencyNotation = "io.papermc.paper:paper-api:1.19.2-R0.1-SNAPSHOT")
}

tasks {
    withType<JavaCompile> {
        options.encoding = StandardCharsets.UTF_8.name()
    }

    processResources {
        filesMatching("*.yml") {
            expand(project.properties)
        }
    }

    shadowJar {
        archiveBaseName.set(rootProject.name)
        archiveClassifier.set("")
        archiveVersion.set("")
    }
}