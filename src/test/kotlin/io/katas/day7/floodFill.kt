package io.katas.day7

fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
    if (image[sr][sc] == newColor) return image
    process(image, sr, sc, image[sr][sc], newColor)
    return image
}

fun process(image: Array<IntArray>, sr: Int, sc: Int, color: Int, newColor: Int): Unit {
    if(sr < 0 || sr >= image.size || sc < 0 || sc >= image[0].size || image[sr][sc] != color) return
    image[sr][sc] = newColor
    process(image, sr + 1, sc, color, newColor)
    process(image, sr - 1, sc, color, newColor)
    process(image, sr, sc + 1, color, newColor)
    process(image, sr, sc - 1, color, newColor)
}