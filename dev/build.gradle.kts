plugins {
    id("usafacts.galactic.spending.kotlin-application-conventions")
}

dependencies {
    implementation("ch.qos.logback:logback-classic:1.4.14")
    implementation("com.github.ajalt.clikt:clikt:4.2.1")
    // Ugh, this is JUST for the RestClient
    implementation("org.springframework.boot:spring-boot-starter-web:3.1.0")
    // Code generation for models
    implementation("org.jsonschema2pojo:jsonschema2pojo-core:1.2.1")
    // Code generation for clients
    implementation("com.squareup:kotlinpoet:1.15.2")
    implementation("cz.habarta.typescript-generator:typescript-generator-spring:3.2.1263")
    implementation("cz.habarta.typescript-generator:typescript-generator-core:3.2.1263")


    implementation("org.xerial:sqlite-jdbc:3.44.1.0")
    implementation("org.jooq:jooq-codegen:3.18.7")
    // Jackson JSON Object Mapper
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.0")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.0")
    implementation("com.fasterxml.jackson.module:jackson-module-parameter-names:2.13.0")
}

application {
    // Define the main class for the application.
    mainClass.set("usafacts.galactic.spending.dev.DevMainKt")
}
