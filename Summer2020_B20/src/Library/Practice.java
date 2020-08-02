package Library;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        String[] things = { "house", "shed", "slide", "zebra", "park", "garden"};

        for(String s : things){

            switch(s.charAt(1)){
                case 'h':
                System.out.print(1);
                break;
                case'a':
                    System.out.print(2);
                    break;
                case's':
                    System.out.print(3);
                    break;
                case'o':
                default:
                    System.out.print(4);
                case'p':
                    System.out.print(5);
                    break;
                case 'z':
                    System.out.println(6);
            }

        }




    }
}
