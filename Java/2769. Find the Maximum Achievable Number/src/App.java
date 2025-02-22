public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given two integers, num and t. A number x is achievable 
         * if it can become equal to num after applying the following operation at most t times:
         * Increase or decrease x by 1, and simultaneously increase or decrease num by 1.
         * 
         * Return the maximum possible value of x.
         * 
         * Example:
         * Input: num = 4, t = 1
         * Output: 6
         */
        
        Solution sol = new Solution();

        System.out.print("Maximum number after " + 1 + " operation of 4 is " + sol.theMaximumAchievableX(4, 1));
        System.out.print("Maximum number after " + 2 + " operation of 3 is " + sol.theMaximumAchievableX(3, 2));
    }
}
