package io.katas

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class BinaryGapTest {

    @Test
    fun `binary gap of 1001 is 2`() {
        Assertions.assertThat(binaryGap("1001")).isEqualTo(2)
        Assertions.assertThat(binaryGap2("1001")).isEqualTo(2)
        Assertions.assertThat(binaryGap3(9)).isEqualTo(2)
    }

    @Test
    fun `binary gap of 1000010001 is 4`() {
        Assertions.assertThat(binaryGap("1000010001")).isEqualTo(4)
        Assertions.assertThat(binaryGap2("1000010001")).isEqualTo(4)
        Assertions.assertThat(binaryGap3(529)).isEqualTo(4)
    }

    @Test
    fun `binary gap of 10100 is 2`() {
        Assertions.assertThat(binaryGap("10100")).isEqualTo(1)
        Assertions.assertThat(binaryGap2("10100")).isEqualTo(1)
    }

    @Test
    fun `binary gap of 1111 is 0`() {
        Assertions.assertThat(binaryGap("1111")).isEqualTo(0)
        Assertions.assertThat(binaryGap2("1111")).isEqualTo(0)
    }
}