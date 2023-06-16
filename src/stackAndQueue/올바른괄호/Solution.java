package stackAndQueue.올바른괄호;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.charAt(0) == ')')
            return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '('){
                stack.push(c);
            }
            else if (c==')' && !stack.empty())
                stack.pop();
        }
        return stack.size() == 0;
    }
}