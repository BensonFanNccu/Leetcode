public class Solution {
    public boolean isPowerOfFour(int n) {
        if(n < 1){
            return false;
        }else{
            return ((n & n-1) == 0) && ((n & 0xAAAAAAAA) == 0);
        }
    }
}
