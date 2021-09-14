package io.katas.day1

fun binarySearch(nums: IntArray, target: Int): Int {
    if (nums == null) return -1
    if (nums.size == 1 && nums[0] == target) return 0
    val mid = (nums.size - 1) / 2
    return if (nums[mid] == target) mid
    else if (nums[mid] > target) binarySearch(nums, 0, mid, target)
    else if (nums[mid] < target) binarySearch(nums, mid + 1, nums.size - 1, target)
    else -1
}

fun binarySearch(nums: IntArray, low: Int, high: Int, target: Int): Int {
    val mid = (high + low) / 2
    if (low > high) return -1
    return if (nums[mid] == target) mid
    else if (nums[mid] < target) binarySearch(nums, mid + 1, high, target)
    else if (nums[mid] > target) binarySearch(nums, low, mid - 1, target)
    else -1
}