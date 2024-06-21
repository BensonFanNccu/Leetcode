public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        String case1 = "hello";
        String case2 = "happy";

        System.out.println("The score of " + case1 + " is " + sol.scoreOfString(case1));
        System.out.println("The score of " + case2 + " is " + sol.scoreOfString(case2));
    }
}
