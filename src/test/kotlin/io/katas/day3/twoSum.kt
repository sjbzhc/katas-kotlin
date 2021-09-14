package io.katas.day3

fun twoSum(numbers: IntArray, target: Int): IntArray {
    var start = 0
    var end = numbers.size - 1
    while (start < end) {
        val total = numbers[start] + numbers[end]
        if (total > target) end--
        else if (total < target) start ++
        else return intArrayOf(start+1, end+1)
    }
    return intArrayOf(-1)
}