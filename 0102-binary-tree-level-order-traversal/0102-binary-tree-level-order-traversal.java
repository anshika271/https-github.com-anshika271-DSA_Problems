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
    List<List<Integer>>ans=new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
       Queue<TreeNode>q=new LinkedList<>();
     
       if(root!=null) q.add(root);
      
      
       while(q.size()>0){
        ArrayList<Integer>list=new ArrayList<>();
        
        int size=q.size();
        for(int i=0;i<size;i++){
        TreeNode temp=q.poll();
        list.add(temp.val);
        if(temp.left!=null){
            q.add(temp.left);
        }
        if(temp.right!=null){
            q.add(temp.right);
        }
        }
        ans.add(list);
       } 
       return ans;
    }
}