// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.user

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRetrieveParamsTest {

    @Test
    fun create() {
        UserRetrieveParams.builder().userId("userId").build()
    }

    @Test
    fun pathParams() {
        val params = UserRetrieveParams.builder().userId("userId").build()

        assertThat(params._pathParam(0)).isEqualTo("userId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
