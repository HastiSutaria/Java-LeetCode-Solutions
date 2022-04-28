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
   
        TreeNode recursive(int start, int end, int[] nums){
        if(start < 0 || start >= end || end > nums.length){
            return null;
        }
        
        // Go to the middle of the array
        int mid = (end+start) / 2;
        
        TreeNode left = recursive(start, mid, nums);
        TreeNode right = recursive(mid+1, end, nums);

        return new TreeNode(nums[mid], left, right);  
    }    
    
    public TreeNode sortedArrayToBST(int[] nums) {
        return recursive(0, nums.length, nums);
    }
    
}