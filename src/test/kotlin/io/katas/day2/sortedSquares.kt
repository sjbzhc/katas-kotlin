package io.katas.day2

fun sortedSquares(nums: IntArray): IntArray? {
    if (nums.isEmpty()) return null
    val result = IntArray(nums.size)
    var start = 0
    var end = nums.size - 1

    for(i in nums.size -1 downTo 0) {
        if (Math.abs(nums[start]) > Math.abs(nums[end])) {
            result[i] = nums[start] * nums[start]
            start++
        } else {
            result[i] = nums[end] * nums[end]
            end--
        }
    }

    return result
}