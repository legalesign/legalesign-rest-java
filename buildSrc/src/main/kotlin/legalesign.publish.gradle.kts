plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Legalesign API")
                description.set("Legalesign.com is an electronic signature software. This is the documentation\nfor its REST API. Start by creating a trial account at\nhttps://legalesign.com/landing/free-trial/. Upon account activation, select the\nAPI dev option. Get an API key by emailing support@legalesign with background on\nyour use-case and skills. You will be in sandbox mode that will limit you to 5\nsigners. Set up 2FA on your account and then login to\nhttps://logs.legalesign.com to access the API Dashboard, where you can manage\nyou api key, webhooks, and sandbox signers. Contact support to move to\nproduction mode when you are ready. For any queries contact us at\nsupport@legalesign.com.")
                url.set("https://legalesign.com/contact/")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Legalesign")
                        email.set("sales@legalesign.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/legalesign/legalesign-rest-java.git")
                    developerConnection.set("scm:git:git://github.com/legalesign/legalesign-rest-java.git")
                    url.set("https://github.com/legalesign/legalesign-rest-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
