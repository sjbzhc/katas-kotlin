package io.katas.day3

fun moveZeroes(nums: IntArray): Unit {
    if (nums == null || nums.size == 0) return

    for (i in 1 until nums.size) {
        if (nums[i] != 0) {
            var j = 0
            while (i-1-j >=0 && nums[i-1-j] == 0) {
                val temp = nums[i-j]
                nums[i-1-j] = temp
                nums[i-j] = 0
                j++
            }
        }
    }
}

fun moveZeroes2(nums: IntArray): Unit {
    var last = 0

    for (curr in nums.indices) {
        if (nums[curr] != 0) nums[curr] = nums[last].also { nums[last++] = nums[curr] }
    }
}