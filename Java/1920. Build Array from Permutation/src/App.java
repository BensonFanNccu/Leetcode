import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        int[] case1 = new int[]{0, 2, 1, 5, 3, 4};
        int[] case2 = new int[]{5, 0, 1, 2, 3, 4};

        System.out.println(Arrays.toString(sol.buildArray(case1)));
        System.out.println(Arrays.toString(sol.buildArray(case2)));
    }
}
