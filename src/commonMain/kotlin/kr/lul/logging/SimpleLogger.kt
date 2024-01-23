package kr.lul.logging

class SimpleLogger(
    override val name: String
) : Logger {
    init {
        if (name.isBlank()) {
            throw IllegalArgumentException("name is blank : name='$name'")
        }
    }

    override fun v(message: String) {
        println("V/$name - $message")
    }

    override fun v(message: String, e: Throwable) {
        println("V/$name - $message\n${e.stackTraceToString()}")
    }

    override fun d(message: String) {
        println("D/$name - $message")
    }

    override fun d(message: String, e: Throwable) {
        println("D/$name - $message\n${e.stackTraceToString()}")
    }

    override fun i(message: String) {
        println("I/$name - $message")
    }

    override fun i(message: String, e: Throwable) {
        println("I/$name - $message\n${e.stackTraceToString()}")
    }

    override fun w(message: String) {
        println("W/$name - $message")
    }

    override fun w(message: String, e: Throwable) {
        println("W/$name - $message\n${e.stackTraceToString()}")
    }

    override fun e(message: String) {
        println("E/$name - $message")
    }

    override fun e(message: String, e: Throwable) {
        println("E/$name - $message\n${e.stackTraceToString()}")
    }

    override fun toString() = "SimpleLogger(name='$name')"
}
