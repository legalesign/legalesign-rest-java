// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.status

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusRetrieveParamsTest {

    @Test
    fun create() {
        StatusRetrieveParams.builder().docId("docId").build()
    }

    @Test
    fun pathParams() {
        val params = StatusRetrieveParams.builder().docId("docId").build()

        assertThat(params._pathParam(0)).isEqualTo("docId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
