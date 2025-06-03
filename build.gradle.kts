plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.9.22"
    id("org.jetbrains.intellij") version "1.17.2"
    id("org.jetbrains.grammarkit") version "2022.3.2.2"
}

group = "com.icp"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://packages.jetbrains.team/maven/p/ij/intellij-dependencies")
}

intellij {
    version.set("2023.1.5")
    type.set("IC")
    plugins.set(listOf("java", "org.jetbrains.plugins.terminal"))
    updateSinceUntilBuild.set(false)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    jvmToolchain(17)
}

tasks {
    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }

    patchPluginXml {
        sinceBuild.set("231")
        untilBuild.set("241.*")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }
    
    // Grammar-Kit tasks
    val generateMotokoLexer = register<org.jetbrains.grammarkit.tasks.GenerateLexerTask>("generateMotokoLexer") {
        sourceFile.set(file("src/main/kotlin/com/icp/intellij/motoko/lexer/MotokoLexer.flex"))
        targetOutputDir.set(file("src/main/gen/com/icp/intellij/motoko/lexer"))
        purgeOldFiles.set(true)
    }
    
    val generateMotokoParser = register<org.jetbrains.grammarkit.tasks.GenerateParserTask>("generateMotokoParser") {
        sourceFile.set(file("src/main/grammar/Motoko.bnf"))
        targetRootOutputDir.set(file("src/main/gen"))
        pathToParser.set("/com/icp/intellij/motoko/parser/MotokoParser.java")
        pathToPsiRoot.set("/com/icp/intellij/motoko/psi")
        purgeOldFiles.set(true)
    }
    
    val generateRustLexer = register<org.jetbrains.grammarkit.tasks.GenerateLexerTask>("generateRustLexer") {
        sourceFile.set(file("src/main/grammar/Rust.flex"))
        targetOutputDir.set(file("src/main/gen/com/icp/intellij/rust/parser"))
        purgeOldFiles.set(true)
    }
    
    val generateRustParser = register<org.jetbrains.grammarkit.tasks.GenerateParserTask>("generateRustParser") {
        sourceFile.set(file("src/main/grammar/Rust.bnf"))
        targetRootOutputDir.set(file("src/main/gen"))
        pathToParser.set("/com/icp/intellij/rust/parser/RustParser.java")
        pathToPsiRoot.set("/com/icp/intellij/rust/psi")
        purgeOldFiles.set(true)
    }
    
    compileJava {
        dependsOn(generateMotokoLexer, generateMotokoParser)
        options.compilerArgs.addAll(listOf("--enable-preview"))
    }
    
    compileKotlin {
        dependsOn(compileJava)
        kotlinOptions {
            jvmTarget = "17"
            freeCompilerArgs = listOf("-Xjvm-default=all")
        }
    }

    processResources {
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
    }

    // Configure source sets to include generated sources
    sourceSets {
        main {
            java {
                srcDirs("src/main/java", "src/main/gen")
            }
            kotlin {
                srcDirs("src/main/kotlin")
            }
            resources.srcDirs("src/main/resources")
        }
    }

    // Configure compilation tasks
    compileJava {
        dependsOn(generateMotokoLexer, generateMotokoParser)
        options.release.set(17)
    }
    compileKotlin {
        dependsOn(generateMotokoLexer, generateMotokoParser)
        kotlinOptions {
            jvmTarget = "17"
            freeCompilerArgs = listOf("-Xjvm-default=all")
            sourceSets["main"].kotlin.srcDirs("src/main/gen")
        }
    }

    // Configure test compilation
    compileTestKotlin {
        kotlinOptions {
            jvmTarget = "17"
            freeCompilerArgs = listOf("-Xjvm-default=all")
        }
    }
    
    compileTestJava {
        options.release.set(17)
    }
}

dependencies {
    // Kotlin dependencies
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable")
    
    // ANTLR dependencies
    implementation("org.antlr:antlr4:4.13.1")
    implementation("org.antlr:antlr4-runtime:4.13.1")
}