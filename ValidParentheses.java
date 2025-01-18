import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        if(s.length() == 1 || s.isEmpty()) return false;

        for(char c : s.toCharArray()){
            if(c == '(') stk.push(')');
            else if(c == '{') stk.push('}');
            else if(c == '[') stk.push(']');

            else if(stk.isEmpty() || stk.pop() != c) return false;
        }
        return stk.isEmpty();
    }
}
