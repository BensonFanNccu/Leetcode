public class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        char prev = s.charAt(0);

        for(char c : s.toCharArray()){
            ans += Math.abs(c - prev);
            prev = c;
        }

        return ans;
    }
}
