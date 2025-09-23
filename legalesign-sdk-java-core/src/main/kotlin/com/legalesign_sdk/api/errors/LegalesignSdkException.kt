package com.legalesign_sdk.api.errors

open class LegalesignSdkException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
