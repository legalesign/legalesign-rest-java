// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.document

import com.legalesign.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListParamsTest {

    @Test
    fun create() {
        DocumentListParams.builder()
            .group("group")
            .archived("archived")
            .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .email("email")
            .limit(0L)
            .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .nosigners("nosigners")
            .offset(0L)
            .status(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DocumentListParams.builder()
                .group("group")
                .archived("archived")
                .createdGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .limit(0L)
                .modifiedGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .nosigners("nosigners")
                .offset(0L)
                .status(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("group", "group")
                    .put("archived", "archived")
                    .put("created_gt", "2019-12-27T18:11:19.117Z")
                    .put("email", "email")
                    .put("limit", "0")
                    .put("modified_gt", "2019-12-27T18:11:19.117Z")
                    .put("nosigners", "nosigners")
                    .put("offset", "0")
                    .put("status", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DocumentListParams.builder().group("group").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("group", "group").build())
    }
}
