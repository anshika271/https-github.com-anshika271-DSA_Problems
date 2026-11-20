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
      int idx=0;
    public  TreeNode solve(int[]inorder, int[]preorder,int start, int end){
        if(start>end){
            return null;
        }
        int rootval=preorder[idx];
        int i=start;
        for(i=start;i<=end;i++){
            if(inorder[i]==rootval){
                break;
            }
        }
        idx++;
        TreeNode root=new TreeNode(rootval);
        root.left=solve(inorder,preorder,start,i-1);
        root.right=solve(inorder,preorder,i+1,end);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     int n=preorder.length;
   
    return solve(inorder,preorder,0,n-1);   
    }
}