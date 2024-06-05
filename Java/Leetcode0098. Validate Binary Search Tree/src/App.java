public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        TreeNode case1 = sol.buildTree(new int[]{2, 1, 3}, 0, 3);
        TreeNode case2 = sol.buildTree(new int[]{5, 1, 4, 7, 8, 3, 6}, 0, 7);

        System.out.println(sol.isValidBST(case1));
        System.out.println(sol.isValidBST(case2));
    }
}
