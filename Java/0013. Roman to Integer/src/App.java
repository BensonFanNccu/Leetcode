public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Roman numerals are represented by seven different symbols: 
         * I, V, X, L, C, D and M.
         * 
         * Example:
         * Input: s = "III"
         * Output: 3
         * Explanation: III = 3.
         */

        Solution sol = new Solution();

        String case1 = "III";
        String case2 = "LVIII";
        String case3 = "MCMXCIV";

        System.out.println(case1 + " is " + sol.romanToInt(case1) + ".");
        System.out.println(case2 + " is " + sol.romanToInt(case2) + ".");
        System.out.println(case3 + " is " + sol.romanToInt(case3) + ".");
    }
}
