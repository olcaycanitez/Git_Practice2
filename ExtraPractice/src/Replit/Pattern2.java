package Replit;
/*
make triangle...
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 */

public class Pattern2 {
    public static void main(String[] args) {

        for(int i =6; i >= 0; i--){ // outer...
            for(int j = i; j >= 0; j--){ // inner
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
