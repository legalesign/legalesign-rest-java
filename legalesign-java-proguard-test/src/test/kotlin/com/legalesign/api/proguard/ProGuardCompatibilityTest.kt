// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.client.okhttp.LegalesignOkHttpClient
import com.legalesign.api.core.jsonMapper
import com.legalesign.api.models.document.DocumentStatusEnum
import com.legalesign.api.models.group.GroupRetrieveResponse
import java.time.OffsetDateTime
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
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/legalesign-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = LegalesignOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.attachment()).isNotNull()
        assertThat(client.document()).isNotNull()
        assertThat(client.group()).isNotNull()
        assertThat(client.invited()).isNotNull()
        assertThat(client.member()).isNotNull()
        assertThat(client.notifications()).isNotNull()
        assertThat(client.pdf()).isNotNull()
        assertThat(client.signer()).isNotNull()
        assertThat(client.status()).isNotNull()
        assertThat(client.subscribe()).isNotNull()
        assertThat(client.template()).isNotNull()
        assertThat(client.templatepdf()).isNotNull()
        assertThat(client.unsubscribe()).isNotNull()
        assertThat(client.user()).isNotNull()
    }

    @Test
    fun groupRetrieveResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val groupRetrieveResponse =
            GroupRetrieveResponse.builder()
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultEmail("None")
                .defaultExtraemail("None")
                .footer("None")
                .footerHeight(0L)
                .header("None")
                .isActive(true)
                .addMember(
                    "/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/,  /api/v1/user/u1u1u1u1-u1u1-u1u1-u1u1-u1u1u1u1u1u1/"
                )
                .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("my group")
                .pagesize(1)
                .publicName("global exports")
                .resourceUri("/api/v1/group/my-group/")
                .slug("my-group")
                .user("/api/v1/user/u0u0u0u0-u0u0-u0u0-u0u0-u0u0u0u0u0u0/")
                .xframeAllow(false)
                .xframeAllowPdfEdit(false)
                .build()

        val roundtrippedGroupRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupRetrieveResponse),
                jacksonTypeRef<GroupRetrieveResponse>(),
            )

        assertThat(roundtrippedGroupRetrieveResponse).isEqualTo(groupRetrieveResponse)
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
