plugins {
    id("legalesign.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":legalesign-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :legalesign-java-example:run` to run `Main`
    // Use `./gradlew :legalesign-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.legalesign.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
