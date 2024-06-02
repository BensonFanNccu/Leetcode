import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        int[] testCase = new int[]{1,3,5,6};

        System.out.println("nums: " + Arrays.toString(testCase) + " target: " + 5 + " Position: " + sol.searchInsert(testCase, 5));
        System.out.println("nums: " + Arrays.toString(testCase) + " target: " + 2 + " Position: " + sol.searchInsert2(testCase, 2));
        System.out.println("nums: " + Arrays.toString(testCase) + " target: " + 7 + " Position: " + sol.searchInsert(testCase, 7));
    }
}
