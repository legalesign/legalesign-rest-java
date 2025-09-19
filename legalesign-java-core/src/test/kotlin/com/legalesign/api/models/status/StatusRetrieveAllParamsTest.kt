// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.status

import com.legalesign.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusRetrieveAllParamsTest {

    @Test
    fun create() {
        StatusRetrieveAllParams.builder().filter("filter").limit(0L).offset(0L).build()
    }

    @Test
    fun queryParams() {
        val params = StatusRetrieveAllParams.builder().filter("filter").limit(0L).offset(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter", "filter")
                    .put("limit", "0")
                    .put("offset", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = StatusRetrieveAllParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
