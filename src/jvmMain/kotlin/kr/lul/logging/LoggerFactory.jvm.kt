package kr.lul.logging

actual fun Logger(name: String): Logger = Slf4JLogger(name)

fun Logger(clazz: Class<*>): Slf4JLogger = Slf4JLogger(clazz)
