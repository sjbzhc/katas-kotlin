package io.katas.day2

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class sortedSquaresTest {
    @Test
    fun `(-4,-1,0,3,10) returns (0,1,9,16,100)`() {
        Assertions.assertThat(sortedSquares(intArrayOf(-4,-1,0,3,10)))
            .isEqualTo(intArrayOf(0,1,9,16,100))
    }

    @Test
    fun `(-7,-3,2,3,11) returns (4,9,9,49,121)`() {
        Assertions.assertThat(sortedSquares(intArrayOf(-7,-3,2,3,11)))
            .isEqualTo(intArrayOf(4,9,9,49,121))
    }
}