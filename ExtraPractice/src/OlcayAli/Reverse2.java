package OlcayAli;
/*
  4. write a program that can calculate the sum of all numbers between 1 to 100
    5. write a program that can calculate the sum of all the even numbers between 1 ~ 100
    6. write a program that can calculate the sum of all the odd numbers between 1 ~ 100

 */

public class Reverse2 {
    public static void main(String[] args) {

       int sum = 0;
       int evenSum = 0;
       int oddSum = 0;

        for(int i = 1; i <= 100; i++){
            sum += i;                    // 0 , 1,3,7,
        }
        System.out.println(sum);

        for(int j = 2; j <= 100; j = j + 2 ){ // i = i + 2
            evenSum += j;

        }
        System.out.println(evenSum);

        for(int k = 1; k <= 100; k +=2 ){
           // k % 2 == , !=
            oddSum += k;
        }

        System.out.println(oddSum);

    }
}
