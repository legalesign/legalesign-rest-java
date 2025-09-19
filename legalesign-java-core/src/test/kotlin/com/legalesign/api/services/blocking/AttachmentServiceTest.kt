// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClient
import com.legalesign.api.models.attachment.AttachmentListParams
import com.legalesign.api.models.attachment.AttachmentUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AttachmentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentService = client.attachment()

        val attachmentResponse = attachmentService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        attachmentResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentService = client.attachment()

        val attachments =
            attachmentService.list(
                AttachmentListParams.builder().group("my-group").limit(0L).offset(0L).build()
            )

        attachments.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentService = client.attachment()

        attachmentService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentService = client.attachment()

        attachmentService.upload(
            AttachmentUploadParams.builder()
                .filename("IK-GV--w1tvt7pdf")
                .group("/api/v1/group/IK-GV--w1tvt/")
                .pdfFile("U3RhaW5sZXNzIHJvY2tz")
                .description("description")
                .user("/api/v1/user/IK-GV--w1tvt/")
                .build()
        )
    }
}
