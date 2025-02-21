public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an integer n, return the number of trailing zeroes in n!.
         * 
         * Example:
         * Input: n = 3
         * Output: 0
         * Explanation: 3! = 6, no trailing zero.
         */

        Solution sol = new Solution();
        
        int case1 = 5;
        int case2 = 10;

        System.out.println("There are " + sol.trailingZeroes(case1) + " trailing zeros in " + case1 + "!");
        System.out.println("There are " + sol.trailingZeroes(case2) + " trailing zeros in " + case2 + "!");
    }
}
