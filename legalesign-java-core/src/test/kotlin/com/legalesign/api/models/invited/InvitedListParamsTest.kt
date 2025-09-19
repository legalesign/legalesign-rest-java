// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.invited

import com.legalesign.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitedListParamsTest {

    @Test
    fun create() {
        InvitedListParams.builder().group("group").build()
    }

    @Test
    fun queryParams() {
        val params = InvitedListParams.builder().group("group").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("group", "group").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InvitedListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
