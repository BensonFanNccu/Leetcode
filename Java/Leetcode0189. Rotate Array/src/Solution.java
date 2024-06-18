import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        k = k % nums.length;

        for(int i = k; i < nums.length; i++){
            ans[i] = nums[i - k];
        }
        for(int i = 0; i < k; i++){
            ans[i] = nums[nums.length - k + i];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = ans[i];
        }

        System.out.println(Arrays.toString(nums));
    }
}
