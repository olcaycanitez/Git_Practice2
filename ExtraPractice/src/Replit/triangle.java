package Replit;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(i = 1; i<= n-1; i++);{
            for(j = 1;j<=i ; j++ ){
                System.out.println("*");
            }
            System.out.println();
        }

    }
}
