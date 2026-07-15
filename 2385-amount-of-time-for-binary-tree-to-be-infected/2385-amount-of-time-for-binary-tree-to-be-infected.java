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
    int ans;
    int dfs(TreeNode  root,int start){
        if(root==null)return 0;
        int left=dfs(root.left,start);
        int right=dfs(root.right, start);
        if(root.val ==start){
            ans=Math.max(left,right);
            return -1;
        }
        if(left<0){
            ans=Math.max(ans,right-left);
            return left-1;
        }
        if(right<0){
            ans=Math.max(ans,left-right);
            return right-1;
        }
        else{
            return Math.max(right,left)+1;
        }
    }

    public int amountOfTime(TreeNode root, int start) {
        if(root==null)return 0;
        ans=0;
        dfs(root,start);
        return ans;
    }
}