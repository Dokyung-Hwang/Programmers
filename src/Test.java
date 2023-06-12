import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int gcd = getGCD(a, b);
        System.out.println("최소공배수: " + gcd);
        System.out.println("최소공배수: " + (a + b) / gcd);

    }

    public static int getGCD(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return getGCD(b, a%b);
    }
}
