package 체육복;

import java.util.Arrays;

public class GymSuit {
    public static void main(String[] args) {
        int[] testLost = {4, 2};
        int[] testReserver = {3, 1, 5};
        System.out.println(solution(5, testLost, testReserver));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        // 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        // 도난당한 학생에게 체육복 빌려주는 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
