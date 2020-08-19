

package OlcayAli;
import java.util.*;

public class practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");

        int inputSeconds = scan.nextInt();
        int seconds = inputSeconds%60;
        int minutes = ((inputSeconds- seconds) / 60) % 60 ; // dakikalar
        int hours  = ((inputSeconds- seconds) / 60) / 60;

                // 4000 seconds 1 hour 6 minutes 40 secons

        System.out.println(seconds);
        System.out.println(minutes);
        System.out.println(hours);







    }






}
