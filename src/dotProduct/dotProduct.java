package dotProduct;

public class dotProduct {
    public static void main(String[] args){
        dotProduct dp = new dotProduct();
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        System.out.println(dp.solution(a, b));
    }

    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
}
