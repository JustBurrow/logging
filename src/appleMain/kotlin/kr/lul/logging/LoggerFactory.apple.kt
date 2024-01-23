package kr.lul.logging

actual fun Logger(name: String): Logger = AppleLogger(name)
