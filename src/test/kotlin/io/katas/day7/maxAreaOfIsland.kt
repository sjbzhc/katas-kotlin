package io.katas.day7

fun maxAreaOfIsland(grid: Array<IntArray>): Int {
    val rows = grid.size
    val cols = grid[0].size
    var res = 0

    for (r in 0 until rows) {
        for (c in 0 until cols) {
            res = Math.max(res, dfs(grid, r, c, rows, cols))
        }
    }
    return res
}

fun dfs(grid: Array<IntArray>, r: Int, c: Int, rows: Int, cols: Int): Int {
    val DIR = intArrayOf(0, 1, 0, -1, 0)
    if (r < 0 || r == rows || c < 0 || c == cols || grid[r][c] == 0) return 0
    var res = 1
    grid[r][c] = 0

    for (i in 0..3) res += dfs(grid, r + DIR.get(i), c + DIR.get(i + 1), rows, cols)
    return res
}