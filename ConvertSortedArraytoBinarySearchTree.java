//https://medium.com/nerd-for-tech/convert-sorted-array-to-binary-search-tree-61eccf6df812


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
    public TreeNode sortedArrayToBST(int[] nums) {
        
       return helper(nums, 0, nums.length - 1);
    }
    
    private TreeNode helper(int[] nums, int low, int high) {
        if(low > high) {
            return null;
        }    
        int mid = low + (high - low)/2;
        TreeNode head = new TreeNode(nums[mid]);
        head.left = helper(nums, low, mid - 1);
        head.right = helper(nums, mid + 1, high);
        return head;
        
    }
        
    }
