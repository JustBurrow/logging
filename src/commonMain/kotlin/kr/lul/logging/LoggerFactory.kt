package kr.lul.logging

import kotlin.reflect.KClass

expect fun Logger(name: String): Logger

fun Logger(clazz: KClass<*>): Logger = Logger(clazz.qualifiedName!!)
