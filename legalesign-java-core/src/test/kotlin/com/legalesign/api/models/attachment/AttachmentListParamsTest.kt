// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.attachment

import com.legalesign.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentListParamsTest {

    @Test
    fun create() {
        AttachmentListParams.builder().group("my-group").limit(0L).offset(0L).build()
    }

    @Test
    fun queryParams() {
        val params = AttachmentListParams.builder().group("my-group").limit(0L).offset(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("group", "my-group")
                    .put("limit", "0")
                    .put("offset", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AttachmentListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
