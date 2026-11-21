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
    public static void fun(TreeNode root, int val){
        if(root==null){
            return;
        }
        if((root.left==null && root.right==null)){
          if(root.val>val){
            TreeNode newnode=new TreeNode(val);
            root.left=newnode;
            return;
          }  
          else{
               TreeNode newnode= new TreeNode(val);
               root.right=newnode;
               return;
          }
        }

        if(root.left==null){
            if(root.val>val){
            TreeNode newnode=new TreeNode(val);
            root.left=newnode;
            return;
          } 
        }
        if(root.right==null){
            if(root.val<val){
                TreeNode newnode =new TreeNode(val);
                root.right=newnode;
                return;
            }
        }

        if(root.val>val){
            fun(root.left, val);
        }
        else if(root.val<val){
            fun(root.right, val);
        }


    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            TreeNode newnode=new TreeNode(val);
            return newnode;
        }
        fun(root, val);
        return root;
    }
}