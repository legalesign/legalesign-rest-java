// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.pdf

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PdfCreatePreviewParamsTest {

    @Test
    fun create() {
        PdfCreatePreviewParams.builder()
            .group("/api/v1/group/IK-GV--w1tvt/")
            .isSignaturePerPage(0L)
            .signatureType(0L)
            .signeeCount(0)
            .text("text")
            .footer("footer")
            .footerHeight(0L)
            .header("header")
            .headerHeight(0L)
            .pdfheader(true)
            .title("title")
            .build()
    }

    @Test
    fun body() {
        val params =
            PdfCreatePreviewParams.builder()
                .group("/api/v1/group/IK-GV--w1tvt/")
                .isSignaturePerPage(0L)
                .signatureType(0L)
                .signeeCount(0)
                .text("text")
                .footer("footer")
                .footerHeight(0L)
                .header("header")
                .headerHeight(0L)
                .pdfheader(true)
                .title("title")
                .build()

        val body = params._body()

        assertThat(body.group()).isEqualTo("/api/v1/group/IK-GV--w1tvt/")
        assertThat(body.isSignaturePerPage()).isEqualTo(0L)
        assertThat(body.signatureType()).isEqualTo(0L)
        assertThat(body.signeeCount()).isEqualTo(0)
        assertThat(body.text()).isEqualTo("text")
        assertThat(body.footer()).contains("footer")
        assertThat(body.footerHeight()).contains(0L)
        assertThat(body.header()).contains("header")
        assertThat(body.headerHeight()).contains(0L)
        assertThat(body.pdfheader()).contains(true)
        assertThat(body.title()).contains("title")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PdfCreatePreviewParams.builder()
                .group("/api/v1/group/IK-GV--w1tvt/")
                .isSignaturePerPage(0L)
                .signatureType(0L)
                .signeeCount(0)
                .text("text")
                .build()

        val body = params._body()

        assertThat(body.group()).isEqualTo("/api/v1/group/IK-GV--w1tvt/")
        assertThat(body.isSignaturePerPage()).isEqualTo(0L)
        assertThat(body.signatureType()).isEqualTo(0L)
        assertThat(body.signeeCount()).isEqualTo(0)
        assertThat(body.text()).isEqualTo("text")
    }
}
