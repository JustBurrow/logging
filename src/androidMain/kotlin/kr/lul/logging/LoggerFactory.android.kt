package kr.lul.logging

import android.util.Log

actual fun Logger(name: String): Logger = AndroidLogger(name)

fun Logger.v(message: () -> String) {
    Log.v(name, message())
}

fun Logger.v(e: Throwable, message: () -> String) {
    Log.v(name, message(), e)
}

fun Logger.d(message: () -> String) {
    Log.d(name, message())
}

fun Logger.d(e: Throwable, message: () -> String) {
    Log.d(name, message(), e)
}

fun Logger.i(message: () -> String) {
    Log.i(name, message())
}

fun Logger.i(e: Throwable, message: () -> String) {
    Log.i(name, message(), e)
}

fun Logger.w(message: () -> String) {
    Log.w(name, message())
}

fun Logger.w(e: Throwable, message: () -> String) {
    Log.w(name, message(), e)
}

fun Logger.e(message: () -> String) {
    Log.e(name, message())
}

fun Logger.e(e: Throwable, message: () -> String) {
    Log.e(name, message(), e)
}
