/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    ArrayList<TreeNode>list=new ArrayList<>();
    public boolean fun(TreeNode root,TreeNode p){
              if(root==null){
                return false;
              }
              if(root==p){
                list.add(root);
                return true;
              }
              if(fun(root.left,p)){
                list.add(root);
                return true;
              }
              if(fun(root.right,p)){
                list.add(root);
                return true;
              }
              return false;
    }

    ArrayList<TreeNode>listt=new ArrayList<>();
    public boolean funn(TreeNode root,TreeNode p){
              if(root==null){
                return false;
              }
              if(root==p){
                listt.add(root);
                return true;
              }
              if(funn(root.left,p)){
                listt.add(root);
                return true;
              }
              if(funn(root.right,p)){
                listt.add(root);
                return true;
              }
              return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        list.clear();
        listt.clear();
       fun(root,p);
       funn(root,q);
       TreeNode ans=null;
      for(TreeNode num:list){
        if(listt.contains(num)){
            ans=num;
            break;
        }
      }
      return ans;
    }
}