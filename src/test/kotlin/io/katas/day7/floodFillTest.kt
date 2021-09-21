package io.katas.day7

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class floodFillTest {

    @Test
    fun `(1,1,1),(1,1,0),(1,0,1), sr = 1, sc = 1, newColor = 2 returns (2,2,2),(2,2,0),(2,0,1)`() {
        val array = arrayOf(intArrayOf(1,1,1), intArrayOf(1,1,0), intArrayOf(1,0,1))
        val expected = arrayOf(intArrayOf(2,2,2), intArrayOf(2,2,0), intArrayOf(2,0,1))

        floodFill(array, 1, 1, 2)

        Assertions.assertThat(array).isEqualTo(expected)
    }
}