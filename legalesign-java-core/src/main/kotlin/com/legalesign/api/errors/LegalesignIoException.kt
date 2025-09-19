package com.legalesign.api.errors

class LegalesignIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    LegalesignException(message, cause)
