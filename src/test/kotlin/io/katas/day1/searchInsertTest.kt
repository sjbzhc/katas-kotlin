package io.katas.day1

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class searchInsertTest {
    @Test
    fun `search in (1,3,5,6) for 5 returns 2`() {
        val list = intArrayOf(1,3,5,6)
        Assertions.assertThat(searchInsert(list, 5)).isEqualTo(2)
    }

    @Test
    fun `search in (1,3,5,6) for 2 returns 1`() {
        val list = intArrayOf(1,3,5,6)
        Assertions.assertThat(searchInsert(list, 2)).isEqualTo(1)
    }

    @Test
    fun `search in (1,3,5,6) for 7 returns 4`() {
        val list = intArrayOf(1,3,5,6)
        Assertions.assertThat(searchInsert(list, 7)).isEqualTo(4)
    }
}