package io.katas.day6

fun lengthOfLongestSubstring(s: String): Int {
    val map = HashSet<Char>()
    var max = 0
    var j = 0
    var i = 0
    while (j < s.length) {
        if (!map.contains(s[j])) {
            map.add(s[j++])
            max = Math.max(max, map.size)
        } else {
            /*
            If we encounter a duplicate, remove all chars from the set and increase i up until
            where the repetition occurred. This leaves us with an empty set and in the next iteration
            we go to the if case
            */
            map.remove(s[i++])
        }
    }
    return max
}