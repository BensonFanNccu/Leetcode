public class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }

        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode node, long min, long max){
        if(node == null){
            return true;
        }

        if(node.val <= min || node.val >= max){
            return false;
        }

        return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
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
