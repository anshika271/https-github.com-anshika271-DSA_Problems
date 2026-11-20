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
     
    public static TreeNode fun(int[]inorder,int[]postorder,int start, int end,int[] idx){
        if(start>end){
            return null;
        }
        int rootval=postorder[idx[0]--];
        int i=start;
        while(i<=end){
            if(inorder[i]==rootval){
                break;
            }
            i++;
        }
          
        TreeNode root=new TreeNode(rootval);
         root.right=fun(inorder,postorder,i+1,end,idx);
        root.left=fun(inorder,postorder,start,i-1,idx);
       
        return root;


    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      int n=inorder.length;
     
       int[]idx={n-1};
      return fun(inorder,postorder,0,n-1,idx);

    }
}