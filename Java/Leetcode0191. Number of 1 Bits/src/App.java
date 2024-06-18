public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        int case1 = 5;
        int case2 = 35;
        int case3 = 128;

        System.out.println(sol.hammingWeight(case1));
        System.out.println(sol.hammingWeight(case2));
        System.out.println(sol.hammingWeight(case3));
    }
}
