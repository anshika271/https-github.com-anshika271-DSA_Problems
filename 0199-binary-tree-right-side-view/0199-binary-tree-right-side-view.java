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
     ArrayList<Integer>list=new ArrayList<>();
    public  void fun(TreeNode root){
         Queue<TreeNode>q=new LinkedList<>();
     
      if(root==null){
        return;
      }
      q.add(root);
      while(!q.isEmpty()){
       
        int size=q.size();

        for(int i=0;i<size;i++){
             TreeNode temp=q.poll();
            if(i==0){
               list.add(temp.val);
            }
             if(temp.right!=null){
            q.add(temp.right);
        }
          if(temp.left!=null){
            q.add(temp.left);
        } 
       
        
        }
        
      }
    }
    public List<Integer> rightSideView(TreeNode root) {
       
     fun(root);
      return list;

    }
}