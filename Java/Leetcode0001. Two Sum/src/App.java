import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        int[] testCase1 = new int[] {2,7,11,15};
        int[] testCase2 = new int[] {3,2,4};
        int[] testCase3 = new int[] {3,3};

        System.out.println("Target: " + 9 + ", Output: " + Arrays.toString(sol.twoSum(testCase1, 9)));
        System.out.println("Target: " + 6 + ", Output: " + Arrays.toString(sol.twoSum2(testCase2, 6)));
        System.out.println("Target: " + 6 + ", Output: " + Arrays.toString(sol.twoSum(testCase3, 6)));
    }
}
