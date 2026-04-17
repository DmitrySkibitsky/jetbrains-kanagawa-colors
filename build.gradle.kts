plugins {
    id("org.jetbrains.intellij.platform") version "2.2.1"
}

val generateClassicThemes by tasks.registering(Exec::class) {
    commandLine("python3", "generate_classic_themes.py")
    inputs.file("generate_classic_themes.py")
    inputs.files(fileTree("src/main/resources/themes").include("*.theme.json").exclude("*_classic*"))
    outputs.files(fileTree("src/main/resources/themes").include("*_classic.theme.json"))
}

group = providers.gradleProperty("pluginGroup").get()
version = providers.gradleProperty("pluginVersion").get()

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity(providers.gradleProperty("platformVersion").get())
        instrumentationTools()
    }
}

tasks.named("processResources") {
    dependsOn(generateClassicThemes)
}

intellijPlatform {
    pluginConfiguration {
        name = providers.gradleProperty("pluginName")
        ideaVersion {
            sinceBuild = providers.gradleProperty("pluginSinceBuild")
            untilBuild = provider { null }
        }
    }
}
