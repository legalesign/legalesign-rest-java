// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.templatepdf

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplatepdfConvertTagsParamsTest {

    @Test
    fun create() {
        TemplatepdfConvertTagsParams.builder().pdfId("pdfId").build()
    }

    @Test
    fun pathParams() {
        val params = TemplatepdfConvertTagsParams.builder().pdfId("pdfId").build()

        assertThat(params._pathParam(0)).isEqualTo("pdfId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
