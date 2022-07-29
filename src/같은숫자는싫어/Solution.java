package 같은숫자는싫어;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arrayTest1 = {1,1,3,3,0,1,1};
        int[] arrayTest2 = {4,4,4,3,3};
        System.out.println(Arrays.toString(solution(arrayTest1)));
        System.out.println(Arrays.toString(solution(arrayTest2)));
    }

    public static int[] solution(int[] arr){
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}
