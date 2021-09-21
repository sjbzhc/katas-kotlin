package io.katas.day7

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class maxAreaOfIslandTest {
    @Test
    fun `max area is 6`() {
        val array = arrayOf(
            intArrayOf(0,0,1,0,0,0,0,1,0,0,0,0,0),
            intArrayOf(0,0,0,0,0,0,0,1,1,1,0,0,0),
            intArrayOf(0,1,1,0,1,0,0,0,0,0,0,0,0),
            intArrayOf(0,1,0,0,1,1,0,0,1,0,1,0,0),
            intArrayOf(0,1,0,0,1,1,0,0,1,1,1,0,0),
            intArrayOf(0,0,0,0,0,0,0,0,0,0,1,0,0),
            intArrayOf(0,0,0,0,0,0,0,1,1,1,0,0,0),
            intArrayOf(0,0,0,0,0,0,0,1,1,0,0,0,0))

        Assertions.assertThat(maxAreaOfIsland(array)).isEqualTo(6)
    }
}