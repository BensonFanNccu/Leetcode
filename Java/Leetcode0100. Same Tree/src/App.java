public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        TreeNode case1 = sol.buildTree(new int[] {1, 2, 3}, 0, 0);
        TreeNode case2 = sol.buildTree(new int[] {1, 2, 3}, 0, 0);
        TreeNode case3 = sol.buildTree(new int[] {1, 1, 3}, 0, 0);
        TreeNode case4 = sol.buildTree(new int[] {1, 2, 3}, 0, 0);

        System.out.println(sol.isSameTree(case1, case2));
        System.out.println(sol.isSameTree(case3, case4));
    }
}
