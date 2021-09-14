package io.katas.day1

fun searchInsert(nums: IntArray, target: Int): Int {
    var index = nums.indexOf(target)
    if (index != -1) return index

    var low = 0
    var high = nums.size - 1
    var mid = 0

    while (low <= high) {
        mid = (low + high) / 2
        if (nums[mid] > target) high = mid - 1
        else if (nums[mid] < target) low = mid + 1
    }

    return if (nums[mid] < target) {
        mid + 1;
    } else {
        mid;
    }

}