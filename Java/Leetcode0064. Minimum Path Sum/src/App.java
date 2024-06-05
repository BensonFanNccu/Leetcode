import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        int[][] case1 = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int[][] case2 = new int[][]{{1, 2, 3}, {4, 5, 6}};

        System.out.println("Input: " + Arrays.deepToString(case1) + " Ans: " + sol.minPathSum(case1));
        System.out.println("Input: " + Arrays.deepToString(case2) + " Ans: " + sol.minPathSum(case2));
    }
}
