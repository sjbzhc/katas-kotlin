package io.katas.day4

fun reverseWords(s: String): String {
    return s.split(" ").map { it.reversed() }.joinToString(separator = " ")
}