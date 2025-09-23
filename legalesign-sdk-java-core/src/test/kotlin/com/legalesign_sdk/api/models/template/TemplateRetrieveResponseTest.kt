// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.template

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateRetrieveResponseTest {

    @Test
    fun create() {
        val templateRetrieveResponse =
            TemplateRetrieveResponse.builder()
                .archive(false)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .group("/api/v1/group/my-group/")
                .hasFields(false)
                .latestText("text/html content")
                .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resourceUri("/api/v1/template/t0t0t0t0-t0t0-t0t0-t0t0-t0t0t0t0t0t0/")
                .signeeCount(1)
                .title("Test text template")
                .user("/api/v1/user/34034334ab34334333rh33434334f9/")
                .uuid("t0t0t0t0-t0t0-t0t0-t0t0-t0t0t0t0t0t0")
                .build()

        assertThat(templateRetrieveResponse.archive()).contains(false)
        assertThat(templateRetrieveResponse.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(templateRetrieveResponse.group()).contains("/api/v1/group/my-group/")
        assertThat(templateRetrieveResponse.hasFields()).contains(false)
        assertThat(templateRetrieveResponse.latestText()).contains("text/html content")
        assertThat(templateRetrieveResponse.modified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(templateRetrieveResponse.resourceUri())
            .contains("/api/v1/template/t0t0t0t0-t0t0-t0t0-t0t0-t0t0t0t0t0t0/")
        assertThat(templateRetrieveResponse.signeeCount()).contains(1)
        assertThat(templateRetrieveResponse.title()).contains("Test text template")
        assertThat(templateRetrieveResponse.user())
            .contains("/api/v1/user/34034334ab34334333rh33434334f9/")
        assertThat(templateRetrieveResponse.uuid()).contains("t0t0t0t0-t0t0-t0t0-t0t0-t0t0t0t0t0t0")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateRetrieveResponse =
            TemplateRetrieveResponse.builder()
                .archive(false)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .group("/api/v1/group/my-group/")
                .hasFields(false)
                .latestText("text/html content")
                .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resourceUri("/api/v1/template/t0t0t0t0-t0t0-t0t0-t0t0-t0t0t0t0t0t0/")
                .signeeCount(1)
                .title("Test text template")
                .user("/api/v1/user/34034334ab34334333rh33434334f9/")
                .uuid("t0t0t0t0-t0t0-t0t0-t0t0-t0t0t0t0t0t0")
                .build()

        val roundtrippedTemplateRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateRetrieveResponse),
                jacksonTypeRef<TemplateRetrieveResponse>(),
            )

        assertThat(roundtrippedTemplateRetrieveResponse).isEqualTo(templateRetrieveResponse)
    }
}
