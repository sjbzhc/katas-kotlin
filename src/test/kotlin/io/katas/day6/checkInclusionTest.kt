package io.katas.day6

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class checkInclusionTest {

    @Test
    fun `"ab" is included in "eidbaooo"`() {
        Assertions.assertThat(checkInclusion("ab", "eidbaooo")).isTrue
    }
}