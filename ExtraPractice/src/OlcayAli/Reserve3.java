package OlcayAli;

/*
5. write a program that can calculate the sum of all the even numbers between 1 ~ 100
 */

public class Reserve3 {
    public static void main(String[] args) {

        int sum = 0;


        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }

        }
        System.out.println(sum);

        int oddSum = 0 ;

        for (int i = 1; i <= 100; i++){
            if(i % 2 != 0){
               oddSum += i;
            }


        }

        System.out.println(oddSum);

    }
}
