object Solution {
    //https://leetcode.com/problems/same-tree/
    def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
        if(p==null && q==null) true
        else if(p==null || q==null) false
        else p.value == q.value && isSameTree(p.left, q.left) &&
         isSameTree(p.right, q.right)
    }
    //check if at once both the nodes are null, if yes then return true
    //if one of them is null, return false
    //if both are not null, check if their values are equal and then recursively
    //check for their left and right nodes
}
