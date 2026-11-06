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
   
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       Deque<TreeNode>q=new ArrayDeque<>(); 
    if(root==null){
        return ans;
    }
     q.add(root);
       boolean f=true;
       while(!q.isEmpty()){
        int n=q.size();
        ArrayList<Integer>list=new ArrayList<>();
      
         
        for(int i=0;i<n;i++){
            TreeNode p;
            if(f){
             p=q.pollFirst();
             list.add(p.val);
             if(p.left!=null){
                q.addLast(p.left);
             }

            if(p.right!=null){
                q.addLast(p.right);
             }
            }
           else{
            p=q.pollLast();
           
           
           list.add(p.val);
            if(p.right!=null){
                q.addFirst(p.right);
             }

            if(p.left!=null){
                q.addFirst(p.left);
             }

        }
       
       }
        ans.add(list);
        f=!f;
       }
return ans;
    }
}