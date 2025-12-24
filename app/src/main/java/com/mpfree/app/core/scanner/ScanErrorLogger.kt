package com.mpfree.app.core.scanner

object ScanErrorLogger {
    fun log(message: String, error: Throwable? = null) {
        // Placeholder: Replace with Logcat or file logging as needed
        println("ScanError: $message${error?.let { ": ${it.localizedMessage}" } ?: ""}")
    }
}
