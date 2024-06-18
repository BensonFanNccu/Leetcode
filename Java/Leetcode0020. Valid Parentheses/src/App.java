public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        String case1 = "()[]{}";
        String case2 = "(]";
        String case3 = "{[[]]}";

        System.out.println(sol.isValid(case1));
        System.out.println(sol.isValid(case2));
        System.out.println(sol.isValid(case3));
    }
}
