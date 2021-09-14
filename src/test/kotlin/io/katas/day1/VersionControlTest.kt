package io.katas.day1

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class VersionControlTest {
    @Test
    fun `finds bad version in O(nlogn)`() {
        var versionControl = VersionControl(4)

        Assertions.assertThat(versionControl.firstBadVersion(5)).isEqualTo(4)
    }
}