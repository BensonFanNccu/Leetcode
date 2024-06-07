public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        TreeNode case1 = sol.buildTree(new int[]{3, 9, 20, 4, 5, 15, 7}, 0, 7);
        TreeNode case2 = sol.buildTree(new int[]{1, 2, 3}, 0, 3);

        System.out.println("Maximum depth of case1 is " + sol.maxDepth(case1));
        System.out.println("Maximum depth of case2 is " + sol.maxDepth(case2));
    }
}
