// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClientAsync
import com.legalesign.api.models.attachment.AttachmentListParams
import com.legalesign.api.models.attachment.AttachmentUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AttachmentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentServiceAsync = client.attachment()

        val attachmentResponseFuture =
            attachmentServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val attachmentResponse = attachmentResponseFuture.get()
        attachmentResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentServiceAsync = client.attachment()

        val attachmentsFuture =
            attachmentServiceAsync.list(
                AttachmentListParams.builder().group("my-group").limit(0L).offset(0L).build()
            )

        val attachments = attachmentsFuture.get()
        attachments.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentServiceAsync = client.attachment()

        val future = attachmentServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentServiceAsync = client.attachment()

        val future =
            attachmentServiceAsync.upload(
                AttachmentUploadParams.builder()
                    .filename("IK-GV--w1tvt7pdf")
                    .group("/api/v1/group/IK-GV--w1tvt/")
                    .pdfFile("U3RhaW5sZXNzIHJvY2tz")
                    .description("description")
                    .user("/api/v1/user/IK-GV--w1tvt/")
                    .build()
            )

        val response = future.get()
    }
}
