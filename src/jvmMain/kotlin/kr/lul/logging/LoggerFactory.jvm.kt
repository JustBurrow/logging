package kr.lul.logging

import kotlin.reflect.KClass

actual fun Logger(name: String): Logger = Slf4JLogger(name)

fun Logger(clazz: KClass<*>): Slf4JLogger = Slf4JLogger(clazz)

fun Logger(clazz: Class<*>): Slf4JLogger = Slf4JLogger(clazz)
