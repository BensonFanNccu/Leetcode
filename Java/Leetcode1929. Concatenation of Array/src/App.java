import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        int[] case1 = new int[]{1, 2, 1};
        int[] case2 = new int[]{1, 3, 2, 1};

        System.out.println(Arrays.toString(sol.getConcatenation(case1)));
        System.out.println(Arrays.toString(sol.getConcatenation(case2)));
    }
}
