package io.katas.day3;

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

 class moveZeroesTest {
     @Test
     fun `(0,1,0,3,12) returns (1,3,12,0,0)`() {
         val list = intArrayOf(0,1,0,3,12)
         moveZeroes(list)
         Assertions.assertThat(list)
             .isEqualTo(intArrayOf(1,3,12,0,0))
     }
}
