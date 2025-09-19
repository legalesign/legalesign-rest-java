// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClient
import com.legalesign.api.models.template.TemplateCreateParams
import com.legalesign.api.models.template.TemplateListParams
import com.legalesign.api.models.template.TemplateUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TemplateServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateService = client.template()

        templateService.create(
            TemplateCreateParams.builder()
                .group("/api/v1/group/IK-GV--w1tvt/")
                .latestText("latest_text")
                .title("title")
                .user("/api/v1/user/IK-GV--w1tvt/")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateService = client.template()

        val template = templateService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        template.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateService = client.template()

        templateService.update(
            TemplateUpdateParams.builder()
                .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body("body")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateService = client.template()

        val templates =
            templateService.list(
                TemplateListParams.builder()
                    .archive("archive")
                    .group("group")
                    .limit(0L)
                    .offset(0L)
                    .build()
            )

        templates.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun archive() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateService = client.template()

        templateService.archive("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
