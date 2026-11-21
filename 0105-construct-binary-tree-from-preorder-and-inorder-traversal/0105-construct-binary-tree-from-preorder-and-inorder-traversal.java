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
    //   int idx=0;
    // public  TreeNode solve(int[]inorder, int[]preorder,int start, int end){
    //     if(start>end){
    //         return null;
    //     }
    //     int rootval=preorder[idx];
    //     int i=start;
    //     for(i=start;i<=end;i++){
    //         if(inorder[i]==rootval){
    //             break;
    //         }
    //     }
    //     idx++;
    //     TreeNode root=new TreeNode(rootval);
    //     root.left=solve(inorder,preorder,start,i-1);
    //     root.right=solve(inorder,preorder,i+1,end);

    //     return root;
    // }
    int idx=0;
    public  TreeNode fun(int[]preorder, int[]inorder,HashMap<Integer,Integer>mp,int start, int end){
          if(start>end){
            return null;
          } 

          int rootval=preorder[idx++];
          int i=mp.get(rootval);
          TreeNode root=new TreeNode(rootval);
          root.left=fun(preorder,inorder,mp,start,i-1);
          root.right=fun(preorder,inorder,mp,i+1,end);
          return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    //  int n=preorder.length;
   
    // return solve(inorder,preorder,0,n-1);   

    HashMap<Integer,Integer>mp=new HashMap<>();
    for(int i=0;i<inorder.length;i++){
        mp.put(inorder[i],i);
    }

     int n=preorder.length;
    return fun( preorder , inorder , mp,0,n-1);
    }
}