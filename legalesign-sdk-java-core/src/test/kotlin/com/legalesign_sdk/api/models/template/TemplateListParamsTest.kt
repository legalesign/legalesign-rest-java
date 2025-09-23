// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.template

import com.legalesign_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateListParamsTest {

    @Test
    fun create() {
        TemplateListParams.builder().archive("archive").group("group").limit(0L).offset(0L).build()
    }

    @Test
    fun queryParams() {
        val params =
            TemplateListParams.builder()
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
        val params = TemplateListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
