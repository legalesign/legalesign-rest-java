plugins {
    id("legalesign-sdk.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":legalesign-sdk-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :legalesign-sdk-java-example:run` to run `Main`
    // Use `./gradlew :legalesign-sdk-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.legalesign_sdk.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
