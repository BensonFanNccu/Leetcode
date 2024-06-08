public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        int[] case1 = new int[] {2, 2, 1};
        int[] case2 = new int[] {4, 1, 2, 1, 2};
        int[] case3 = new int[] {1};

        System.out.println("Single number is " + sol.singleNumber(case1));
        System.out.println("Single number is " + sol.singleNumber(case2));
        System.out.println("Single number is " + sol.singleNumber(case3));
    }
}
