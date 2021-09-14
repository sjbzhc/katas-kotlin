package io.katas.day4

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class reverseWordsTest {
    @Test
    fun `"Let's take LeetCode contest" is reversed to "s'teL ekat edoCteeL tsetnoc"`() {
        Assertions.assertThat(reverseWords("Let's take LeetCode contest")).isEqualTo("s'teL ekat edoCteeL tsetnoc")
    }

    @Test
    fun `"God Ding" is reversed to "doG gniD"`() {
        Assertions.assertThat(reverseWords("God Ding")).isEqualTo("doG gniD")
    }
}