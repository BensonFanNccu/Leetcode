class Solution {
    public int maxDepth(TreeNode root) {
        /*
         * Recursion(BFS) Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        if(root == null) return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
