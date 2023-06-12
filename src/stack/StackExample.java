package stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // Integer, String 타입 Stack 선언
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
        // stack = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println(stack);
        System.out.println(stack.pop());    // stack 의 최상단에 있는 값 빼기
        System.out.println(stack.peek());   // stack 의 최상단에 있는 값을 출력
        System.out.println(stack.empty());  // stack 이 비어있는 지 T/F
        System.out.println(stack.contains(3));  // stack 에 3 이 있는지 검사
        stack.clear();  // stack의 전체 값 제거
        System.out.println(stack);
    }
}
