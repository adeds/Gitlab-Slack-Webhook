import io.kotless.plugin.gradle.dsl.kotless
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
    kotlin("plugin.serialization") version "1.5.31"
    id("io.kotless") version "0.2.0" apply true
}

group = "id.ade.ktorwebhooksample"
version = "0.0.1"

repositories {
    mavenCentral()
    maven(url = uri("https://packages.jetbrains.team/maven/p/ktls/maven"))
    maven { url = uri("https://kotlin.bintray.com/ktor") }
}

dependencies {
    implementation("io.kotless:ktor-lang:0.2.0")
    implementation("io.kotless:ktor-lang-aws:0.2.0")

    implementation("io.ktor:ktor-server-core:1.6.7")

    implementation("io.ktor:ktor-client-core:1.6.7")
    implementation("io.ktor:ktor-client-cio:1.6.7")
    implementation("io.ktor:ktor-client-gson:1.6.7")
    implementation("io.ktor:ktor-client-logging-jvm:1.6.7")

    implementation("io.ktor:ktor-locations:1.6.7")
    implementation("io.ktor:ktor-gson:1.6.7")
    implementation("io.ktor:ktor-kotlinMultiplatform:1.6.7")

    testImplementation(kotlin("test"))
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

kotless {
    config {
        aws {
            storage {
                bucket = "..."
            }
            profile = "..."
            region = "ap-southeast-3"
        }
    }

    webapp {
        lambda {
            kotless {
                packages = setOf("id.ade.ktorwebhooksample")
            }
        }
    }
}