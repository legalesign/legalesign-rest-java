package com.legalesign_sdk.api.errors

class LegalesignSdkInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    LegalesignSdkException(message, cause)
