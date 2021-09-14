package io.katas.day3

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class twoSumTest {

    @Test
    fun `(2,7,11,15) with target 9 returns (1,2)`() {
        Assertions.assertThat(twoSum(intArrayOf(2,7,11,15), 9)).isEqualTo(intArrayOf(1,2))
    }

    @Test
    fun `(2,3,4) with target 6 returns (1,3)`() {
        Assertions.assertThat(twoSum(intArrayOf(2,3,4), 6)).isEqualTo(intArrayOf(1,3))
    }
}