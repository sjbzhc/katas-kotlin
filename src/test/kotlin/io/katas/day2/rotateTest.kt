package io.katas.day2

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class rotateTest {
    @Test
    fun `rotate (1,2,3,4,5,6,7) by 3 returns (5,6,7,1,2,3,4)`() {
        val arr = intArrayOf(1,2,3,4,5,6,7)
        rotate(arr, 3)
        Assertions.assertThat(arr)
            .isEqualTo(intArrayOf(5,6,7,1,2,3,4))
    }
}