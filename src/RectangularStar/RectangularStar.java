package RectangularStar;
import java.util.Scanner;

public class RectangularStar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = 0; i < b; i++){
            for (int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
