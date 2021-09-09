package io.katas

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) return true
    if ((p == null && q != null) || (p != null && q == null)) return false
    if (p?.`val` != q?.`val`) return false
    return isSameTree(p?.right, q?.right) && isSameTree(p?.left, q?.left)
}

fun isSameTree2(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) return true
    return (p?.`val` == q?.`val`) && isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
}