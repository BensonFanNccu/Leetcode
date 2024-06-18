import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                ans.push(s.charAt(i));
            }

            if(ans.isEmpty()){
                return false;
            }

            if(s.charAt(i) == ')' && ans.pop() != '('){
                return false;
            }

            if(s.charAt(i) == ']' && ans.pop() != '['){
                return false;
            }

            if(s.charAt(i) == '}' && ans.pop() != '{'){
                return false;
            }
        }

        return ans.isEmpty();
    }
}
