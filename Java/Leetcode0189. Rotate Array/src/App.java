public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        int[] case1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] case2 = new int[]{3, 11, -99, 100};

        sol.rotate(case1, 3);
        sol.rotate(case2, 2);
    }
}
