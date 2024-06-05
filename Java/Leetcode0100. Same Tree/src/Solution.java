public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }

        return isSame(p, q);
    }

    public boolean isSame(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }

        if((p == null && q != null) || p != null && q == null){
            return false;
        }

        if(p.val != q.val){
            return false;
        }

        return isSame(p.left, q.left) && isSame(p.right, q.right);
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
