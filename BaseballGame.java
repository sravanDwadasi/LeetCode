import java.util.Stack;

class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String str : operations) {
            switch (str) {
                case "C" -> stack.pop();
                case "D" -> stack.push(stack.peek() * 2);
                case "+" -> {
                    int last = stack.pop();
                    int temp = stack.peek() + last;
                    stack.push(last);
                    stack.push(temp);
                }
                default -> stack.push(Integer.valueOf(str));
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}