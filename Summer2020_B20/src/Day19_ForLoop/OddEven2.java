package Day19_ForLoop;

/*
3. print odd numbers between 1 to 50
4. print even numbers between 1 to 50
 */

public class OddEven2 {
    public static void main(String[] args) {

        for(int i = 1; i <= 50; i++){

            if( i % 2 == 0){// if the number is odd, then skip
                continue;
            }

            System.out.print(i + " ");

        }
        System.out.println();

        System.out.println("===================================================");

        for(int i = 1; i <= 50; i++){

            if( i % 2 != 0){
                continue;
            }

            System.out.print( i + " ");

        }

    }
}
