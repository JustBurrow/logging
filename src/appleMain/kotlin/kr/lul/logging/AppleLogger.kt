package kr.lul.logging

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.ptr
import platform.darwin.OS_LOG_DEFAULT
import platform.darwin.OS_LOG_TYPE_DEBUG
import platform.darwin.OS_LOG_TYPE_DEFAULT
import platform.darwin.OS_LOG_TYPE_ERROR
import platform.darwin.OS_LOG_TYPE_FAULT
import platform.darwin.__dso_handle
import platform.darwin._os_log_internal

@OptIn(ExperimentalForeignApi::class)
class AppleLogger(
    override val name: String
) : Logger {
    init {
        if (name.isBlank()) {
            throw IllegalArgumentException("name is blank : name='$name'")
        }
    }

    override fun v(message: String) = _os_log_internal(
        __dso_handle.ptr,
        OS_LOG_DEFAULT,
        OS_LOG_TYPE_DEBUG,
        "V/$name - $message"
    )

    override fun v(message: String, e: Throwable) = _os_log_internal(
        __dso_handle.ptr,
        OS_LOG_DEFAULT,
        OS_LOG_TYPE_DEBUG,
        "V/$name - $message\n${e.stackTraceToString()}"
    )

    override fun d(message: String) = _os_log_internal(
        __dso_handle.ptr,
        OS_LOG_DEFAULT,
        OS_LOG_TYPE_DEBUG,
        "D/$name - $message"
    )

    override fun d(message: String, e: Throwable) = _os_log_internal(
        __dso_handle.ptr,
        OS_LOG_DEFAULT,
        OS_LOG_TYPE_DEBUG,
        "D/$name - $message\n${e.stackTraceToString()}"
    )

    override fun i(message: String) = _os_log_internal(
        __dso_handle.ptr,
        OS_LOG_DEFAULT,
        OS_LOG_TYPE_DEFAULT,
        "I/$name - $message"
    )

    override fun i(message: String, e: Throwable) = _os_log_internal(
        __dso_handle.ptr,
        OS_LOG_DEFAULT,
        OS_LOG_TYPE_DEFAULT,
        "I/$name - $message\n${e.stackTraceToString()}"
    )

    override fun w(message: String) = _os_log_internal(
        __dso_handle.ptr,
        OS_LOG_DEFAULT,
        OS_LOG_TYPE_ERROR,
        "W/$name - $message"
    )

    override fun w(message: String, e: Throwable) = _os_log_internal(
        __dso_handle.ptr,
        OS_LOG_DEFAULT,
        OS_LOG_TYPE_ERROR,
        "W/$name - $message\n${e.stackTraceToString()}"
    )

    override fun e(message: String) = _os_log_internal(
        __dso_handle.ptr,
        OS_LOG_DEFAULT,
        OS_LOG_TYPE_FAULT,
        "E/$name - $message"
    )

    override fun e(message: String, e: Throwable) = _os_log_internal(
        __dso_handle.ptr,
        OS_LOG_DEFAULT,
        OS_LOG_TYPE_FAULT,
        "E/$name - $message\n${e.stackTraceToString()}"
    )

    override fun toString() = "AppleLogger(name='$name')"
}
