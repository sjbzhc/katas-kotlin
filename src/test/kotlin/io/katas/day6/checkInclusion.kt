package io.katas.day6

fun checkInclusion(s1: String, s2: String): Boolean {
    val count = IntArray(26)
    // First decrease the count for each char in s1
    for (element in s1) count[element - 'a']--

    var l = 0
    var r = 0
    while (r < s2.length) {
        /*
        * r and l are there to move the sliding window
        * Here we first increase the count for the current r-char in s2
        * if the count according to r is bigger than 0 after having increased it
        * we decrease the counter of the l-char in s2 and increase l
        * */
        if (++count[s2[r] - 'a'] > 0) {
            /*
            * If we don't go to the else case, then r is always following l one behind, l is increased here,
            * r before the next iteration. In effect, we do nothing, since we increase and decrease the counter in
            * the same position
            * */
            while (--count[s2[l++] - 'a'] != 0) {
            }
        }
        /*
        * else is reached only when the first if fails, which means that that count at r-char of s2 is smaller than 0
        * true is returned only if the first if was skipped a sufficient amount of times for the distance between
        * l and r to be large enough
        * */
        else if (r - l + 1 == s1.length) return true
        r++
    }

    return s1.length == 0
    }
