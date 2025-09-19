// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.member

import com.legalesign.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberListParamsTest {

    @Test
    fun create() {
        MemberListParams.builder().group("group").limit(0L).offset(0L).build()
    }

    @Test
    fun queryParams() {
        val params = MemberListParams.builder().group("group").limit(0L).offset(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("group", "group")
                    .put("limit", "0")
                    .put("offset", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MemberListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
