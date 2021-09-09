package io.katas

fun isSymmetric(node: TreeNode?): Boolean {
    if (node == null) return true
    return isSymmetric(node.left, node.right)
}

fun isSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
    if (left == null && right == null) return true
    if ((left == null && right != null) || (left != null && right == null)) return false
//    Alternatively
//    if (left == null || right == null) return left == right
    if (left?.`val` != right?.`val`) return false
    return isSymmetric(left?.right, right?.left) && isSymmetric(left?.left, right?.right)
}