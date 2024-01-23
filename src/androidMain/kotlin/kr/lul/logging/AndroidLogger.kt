package kr.lul.logging

import android.util.Log

class AndroidLogger(
    override val name: String
) : Logger {
    init {
        if (name.isBlank()) {
            throw IllegalArgumentException("name is blank : name='$name'")
        }
    }

    override fun v(message: String) {
        Log.v(name, message)
    }

    override fun v(message: String, e: Throwable) {
        Log.v(name, message, e)
    }

    override fun d(message: String) {
        Log.d(name, message)
    }

    override fun d(message: String, e: Throwable) {
        Log.d(name, message, e)
    }

    override fun i(message: String) {
        Log.i(name, message)
    }

    override fun i(message: String, e: Throwable) {
        Log.i(name, message, e)
    }

    override fun w(message: String) {
        Log.w(name, message)
    }

    override fun w(message: String, e: Throwable) {
        Log.w(name, message, e)
    }

    override fun e(message: String) {
        Log.e(name, message)
    }

    override fun e(message: String, e: Throwable) {
        Log.e(name, message, e)
    }

    override fun toString() = "AndroidLogger(name='$name')"
}