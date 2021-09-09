package io.katas

fun binaryGap(number: String): Int {
    var result = 0
    var first1 = -1
    var second1 = -1
    number.forEachIndexed { index, c ->
        run {
            if (number[index] == '1') {
                if (first1 == -1) {
                    first1 = index
                } else {
                    second1 = index;
                    val temp = second1 - first1
                    if (temp > result) {
                        result = temp
                    }
                    first1 = second1
                    second1 = -1
                }
            }
        }
    }
    return if (result > 0) {
        result - 1
    } else {
        result
    }
}

fun binaryGap2(number: String): Int {

    var indexesOfOnes = arrayListOf<Int>()

    number.forEachIndexed { index, c -> run {
        if (c == '1') {
            indexesOfOnes.add(index)
        }
    } }

    var result = 0;

    if (indexesOfOnes.size > 0) {
        for(i in 1..indexesOfOnes.size - 1) {
            if (indexesOfOnes[i] - indexesOfOnes[i-1] - 1 > result) {
                result = indexesOfOnes[i] - indexesOfOnes[i-1] - 1
            }
        }
    }
    return result
}

fun binaryGap3(N: Int): Int {

    val number = N.toString(radix = 2)


    var indexesOfOnes = arrayListOf<Int>()

    number.forEachIndexed { index, c -> run {
        if (c == '1') {
            indexesOfOnes.add(index)
        }
    } }

    var result = 0;

    if (indexesOfOnes.size > 0) {
        for(i in 1..indexesOfOnes.size - 1) {
            if (indexesOfOnes[i] - indexesOfOnes[i-1] - 1 > result) {
                result = indexesOfOnes[i] - indexesOfOnes[i-1] - 1
            }
        }
    }
    return result
}