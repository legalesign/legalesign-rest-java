// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.blocking.templatepdf

import com.legalesign_sdk.api.TestServerExtension
import com.legalesign_sdk.api.client.okhttp.LegalesignSdkOkHttpClient
import com.legalesign_sdk.api.models.document.PdfFieldValidationEnum
import com.legalesign_sdk.api.models.templatepdf.fields.FieldCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FieldServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LegalesignSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fieldService = client.templatepdf().fields()

        fieldService.create(
            FieldCreateParams.builder()
                .pdfId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    FieldCreateParams.Body.builder()
                        .ax(0.0f)
                        .ay(0.0f)
                        .bx(0.0f)
                        .by(0.0f)
                        .elementType(FieldCreateParams.Body.ElementType.SIGNATURE)
                        .page(0)
                        .signer(1)
                        .align(FieldCreateParams.Body.Align._1)
                        .fieldorder(0)
                        .fontName(FieldCreateParams.Body.FontName.EMPTY)
                        .fontSize(6)
                        .hideBorder(true)
                        .label("label")
                        .labelExtra("label_extra")
                        .logicAction(FieldCreateParams.Body.LogicAction._1)
                        .logicGroup("logic_group")
                        .mapTo("map_to")
                        .optional(true)
                        .options("options")
                        .substantive(true)
                        .validation(PdfFieldValidationEnum._1)
                        .value("value")
                        .build()
                )
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LegalesignSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fieldService = client.templatepdf().fields()

        val fields = fieldService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        fields.validate()
    }
}
