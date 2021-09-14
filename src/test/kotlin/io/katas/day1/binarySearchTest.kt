package io.katas.day1

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class binarySearchTest {

    @Test
    fun `(-1,0,3,5,9,12) with target 9 returns 4`() {
        val list = intArrayOf(-1,0,3,5,9,12)
        Assertions.assertThat(binarySearch(list, 9)).isEqualTo(4)
    }

    @Test
    fun `(-1,0,3,5,9,12) with target 2 returns -1`() {
        val list = intArrayOf(-1,0,3,5,9,12)
        Assertions.assertThat(binarySearch(list, 2)).isEqualTo(-1)
    }
}