package OlcayAli;
/*
 Write a program that prints the numbers from 1 to 100 and for multiples of '3' print "Fizz"
 instead of the number and for the multiples of '5' print "Buzz".
 1, 2, FIZZ, 4 , BUZZ, FIZZ, 7, 8 , FIZZ...
 */
public class FizzBuzz {
    public static void main(String[] args) {



        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FIZZBUZZ ");
            }else if(i % 3 == 0){
                System.out.print(" FIZZ ");
            }else if( i % 5 == 0){
                System.out.print(" BUZZ ");
            }else{
                System.out.print(i + " ");

            }
        }

    }
}
