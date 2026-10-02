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
    public static int getlh(TreeNode root){
        int lh=0;
        TreeNode temp=root;
        while(temp!=null){
            lh++;
            temp=temp.left;
        }
        return lh;
    }
     public static int getrh(TreeNode root){
        int rh=0;
        TreeNode temp=root;
        while(temp!=null){
            rh++;
            temp=temp.right;
        }
        return rh;
    }
    public int countNodes(TreeNode root) {
      if(root==null){
        return 0;
      } 
      int lh=getlh(root);
      int rh=getrh(root);
      if(lh==rh){
        return (int)(Math.pow(2,lh)-1);
      }
      return 1+countNodes(root.left)+countNodes(root.right);
    }
}