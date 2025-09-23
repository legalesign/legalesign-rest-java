// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.templatepdf

import com.legalesign_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplatepdfListParamsTest {

    @Test
    fun create() {
        TemplatepdfListParams.builder()
            .archive("archive")
            .group("group")
            .limit(0L)
            .offset(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TemplatepdfListParams.builder()
                .archive("archive")
                .group("group")
                .limit(0L)
                .offset(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archive", "archive")
                    .put("group", "group")
                    .put("limit", "0")
                    .put("offset", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TemplatepdfListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
