package kr.lul.logging

import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

@Suppress("NonAsciiCharacters")
class KotlinFactoryTest {
    @Test
    fun `Logger - 빈 이름`() {
        // WHEN
        val logger = Logger("")
        println("[WHEN] logger=$logger")

        // THEN
        assertNotNull(logger)
        assertTrue(logger.name.isEmpty())
    }

    @Test
    fun `Logger - 이름으로 만들기`() {
        // GIVEN
        val name = "logger-${Random.nextLong(Long.MAX_VALUE)}"
        println("[GIVEN] name=$name")

        // WHEN
        val logger = Logger(name)
        println("[WHEN] logger=$logger")

        // THEN
        assertEquals(name, logger.name)
    }

    @Test
    fun `Logger - 클래스로 만들기`() {
        // WHEN
        val logger = Logger(KotlinFactoryTest::class)
        println("[WHEN] logger=$logger")

        // THEN
        assertEquals(KotlinFactoryTest::class.qualifiedName, logger.name)
    }
}
