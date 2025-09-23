// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.async

import com.legalesign_sdk.api.TestServerExtension
import com.legalesign_sdk.api.client.okhttp.LegalesignSdkOkHttpClientAsync
import com.legalesign_sdk.api.models.template.TemplateCreateParams
import com.legalesign_sdk.api.models.template.TemplateListParams
import com.legalesign_sdk.api.models.template.TemplateUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TemplateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateServiceAsync = client.template()

        val future =
            templateServiceAsync.create(
                TemplateCreateParams.builder()
                    .group("/api/v1/group/IK-GV--w1tvt/")
                    .latestText("latest_text")
                    .title("title")
                    .user("/api/v1/user/IK-GV--w1tvt/")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateServiceAsync = client.template()

        val templateFuture = templateServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val template = templateFuture.get()
        template.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateServiceAsync = client.template()

        val future =
            templateServiceAsync.update(
                TemplateUpdateParams.builder()
                    .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .body("body")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateServiceAsync = client.template()

        val templatesFuture =
            templateServiceAsync.list(
                TemplateListParams.builder()
                    .archive("archive")
                    .group("group")
                    .limit(0L)
                    .offset(0L)
                    .build()
            )

        val templates = templatesFuture.get()
        templates.validate()
    }
}
