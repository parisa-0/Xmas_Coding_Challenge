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
        public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> myQueue = new LinkedList<>();

        myQueue.add(root);

        while(!myQueue.isEmpty()) {
            int size = myQueue.size();
            double sum = 0;
        
            for(int i = 0; i < size; i++) {
                TreeNode node = myQueue.poll();
                sum += node.val;

                if(node.left != null) {
                    myQueue.add(node.left);
                }

                if(node.right != null) {
                    myQueue.add(node.right);
                }
            }
             result.add(sum/size);
        }
        return result;       
    }
}
