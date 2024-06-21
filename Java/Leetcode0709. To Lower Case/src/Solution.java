public class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    //Without built-in
    public String toLowerCase2(String s){
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if ('A' <= arr[i] && arr[i] <= 'Z'){           
                arr[i] = (char) (arr[i] - 'A' + 'a');
            }
        }

        return new String(arr);
    }
}
