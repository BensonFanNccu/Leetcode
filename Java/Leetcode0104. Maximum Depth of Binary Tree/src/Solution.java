public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public TreeNode buildTree(int[] nums, int i, int n){
        TreeNode node = null;

        if(i < n){
            node = new TreeNode(nums[i]);
            node.left = buildTree(nums, i * 2 + 1, n);
            node.right = buildTree(nums, i * 2 + 2, n);
        }

        return node;
    }
}
