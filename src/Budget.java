import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int b = 9;
        System.out.println(solution(d, b));
    }

    public static int solution(int[] d, int budget) {
        int result = 0;
        Arrays.sort(d);

        for (int j : d) {
            budget -= j;
            if (budget < 0)
                break;
            result++;
        }


        return result;
    }
}
