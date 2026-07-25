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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>result=new LinkedList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null)
        {
            return result;
        }
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int level=queue.size();
            List<Integer>current=new LinkedList<>();
            for(int i=0;i<level;i++)
            {
                
                TreeNode currentnode=queue.poll();
                current.add(currentnode.val);
                if(currentnode.left!=null)
                {
                    queue.add(currentnode.left);
                }
                if(currentnode.right!=null)
                {
                    queue.add(currentnode.right);
                }
            }
            result.add(0,current);
        }
        return result;


        
    }
}