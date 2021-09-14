package io.katas.day4

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class reverseStringTest {

    @Test
    fun `('h','e','l','l','o') is reversed to ('o','l','l','e','h')`() {
        val str = charArrayOf('h', 'e', 'l', 'l', 'o')
        reverseString(str)
        Assertions.assertThat(str).isEqualTo(charArrayOf('o','l','l','e','h'))
    }

    @Test
    fun `('H','a','n','n','a','h') is reversed to ('h','a','n','n','a','H')`() {
        val str = charArrayOf('H','a','n','n','a','h')
        reverseString(str)
        Assertions.assertThat(str).isEqualTo(charArrayOf('h','a','n','n','a','H'))
    }
}