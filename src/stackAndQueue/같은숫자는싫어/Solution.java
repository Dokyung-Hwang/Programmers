package stackAndQueue.같은숫자는싫어;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};
        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        System.out.println(stack);
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;


    }
}


 /*
 Q. 입력받은 배열에서 연속적으로 나타나는 숫자 하나만 남기고 제거. 단 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지
 input: int타입 배열
 output: int 타입 배열
 제한사항
 1. 배열의 크기: 1,000,000 이하의 자연수
 2. 배열의 원소의 크기 0~9 정수
 */
