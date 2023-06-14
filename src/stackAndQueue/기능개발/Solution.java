package stackAndQueue.기능개발;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};
        System.out.println(Arrays.toString(solution(progresses1, speeds1)));
        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution(progresses2, speeds2)));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            double days = (100 - progresses[i]) / (double) speeds[i];
            double dayUp = Math.ceil(days);

            int j = i + 1;
            for (; j < progresses.length; j++) {
                if (progresses[j] + dayUp * speeds[j] < 100) break;
            }

            answer.add(j - i);
            i = j - 1;
        }
        int[] answerArr = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            answerArr[i] = answer.get(i);
        }
//        return answer.stream().mapToInt(i -> i.intValue()).toArray();
        return answerArr;
    }
}
// 1. 한 개 기능을 개발하는데 필요한 날짜 계산
// 2. 함께 배포할 기능의 index 찾기
// 3. 이번에 배포할 기능의 개수를 추가하기
