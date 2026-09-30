/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
ArrayList<String>list=new ArrayList<>();
public  void fun(TreeNode root, String s){
    if(root==null){
        return;
    }
     s=s+root.val;
     if(root.left!=null || root.right!=null){
        s=s+"->";
     }
    if(root.left==null && root.right==null){
        list.add(s);
        return;
    }
    
   
    fun(root.left,s);
    fun(root.right,s);
}
    public List<String> binaryTreePaths(TreeNode root) {
       fun(root,"");
       return list; 
    }
}