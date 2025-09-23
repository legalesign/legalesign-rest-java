// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign_sdk.api.client.okhttp.LegalesignSdkOkHttpClient
import com.legalesign_sdk.api.core.jsonMapper
import com.legalesign_sdk.api.models.document.DocumentStatusEnum
import com.legalesign_sdk.api.models.document.ListMeta
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/legalesign-sdk-java-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = LegalesignSdkOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.document()).isNotNull()
        assertThat(client.group()).isNotNull()
        assertThat(client.pdf()).isNotNull()
        assertThat(client.signer()).isNotNull()
        assertThat(client.status()).isNotNull()
        assertThat(client.template()).isNotNull()
        assertThat(client.templatepdf()).isNotNull()
    }

    @Test
    fun listMetaRoundtrip() {
        val jsonMapper = jsonMapper()
        val listMeta =
            ListMeta.builder()
                .limit(0)
                .next("next")
                .offset(0)
                .previous("previous")
                .totalCount(0)
                .build()

        val roundtrippedListMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listMeta),
                jacksonTypeRef<ListMeta>(),
            )

        assertThat(roundtrippedListMeta).isEqualTo(listMeta)
    }

    @Test
    fun documentStatusEnumRoundtrip() {
        val jsonMapper = jsonMapper()
        val documentStatusEnum = DocumentStatusEnum._10

        val roundtrippedDocumentStatusEnum =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentStatusEnum),
                jacksonTypeRef<DocumentStatusEnum>(),
            )

        assertThat(roundtrippedDocumentStatusEnum).isEqualTo(documentStatusEnum)
    }
}
