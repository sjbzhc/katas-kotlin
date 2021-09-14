package io.katas.day2

fun rotate(nums: IntArray, k: Int): Unit {
    if (nums.size <= 1) {
        return
    }
    val step = k % nums.size
    reverse(nums, 0, nums.size - 1)
    reverse(nums, 0, step - 1)
    reverse(nums, step, nums.size - 1)
}

fun reverse(nums: IntArray, n: Int, m: Int) {
    var n = n
    var m = m
    var temp: Int
    while (n < m) {
        temp = nums[m]
        nums[m] = nums[n]
        nums[n] = temp
        n++
        m--
    }
}