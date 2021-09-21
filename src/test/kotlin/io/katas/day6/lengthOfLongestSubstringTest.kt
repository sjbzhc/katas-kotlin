package io.katas.day6

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class lengthOfLongestSubstringTest {
    @Test
    fun `"abcabcbb" returns 3`() {
        Assertions.assertThat(lengthOfLongestSubstring("abcabcbb")).isEqualTo(3)
    }

    @Test
    fun `"bbbbb" returns 1`() {
        Assertions.assertThat(lengthOfLongestSubstring("bbbbb")).isEqualTo(1)
    }

    @Test
    fun `"pwwkew" returns 1`() {
        Assertions.assertThat(lengthOfLongestSubstring("pwwkew")).isEqualTo(3)
    }
}