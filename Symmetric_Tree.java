/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 

Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false
 

Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100
*/
class Solution {
    public boolean isSymmetric(TreeNode root) {
         return isMirror(root,root);}
    public boolean isMirror(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null)return true;
        if(t1==null || t2==null)return false;
return(t1.val==t2.val) && isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
    }
}
