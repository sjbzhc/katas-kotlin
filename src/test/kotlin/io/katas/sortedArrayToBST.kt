package io.katas

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.size == 0) return null
    val mid = nums.size / 2
    val root = TreeNode(nums[mid])
    root.left = solve(nums, 0, mid - 1)
    root.right = solve(nums, mid + 1, nums.size - 1)
    return root
}

fun solve(nums: IntArray, low: Int, high: Int): TreeNode? {
    if (low == high) return TreeNode(nums[low])
    val mid = (low + high) / 2
    if (low > high) return null
    val root = TreeNode(nums[mid])
    root.left = solve(nums, low, mid - 1)
    root.right = solve(nums, mid + 1, high)
    return root
}