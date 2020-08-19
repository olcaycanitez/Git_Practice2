package Replit;

import java.util.Scanner;

public class LoopDrawRect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String output ="";

        char startPoint = start.charAt(0);
        char endPoint = end.charAt(0);
        boolean valid = startPoint == 'A' || startPoint == 'B' || startPoint == 'C' || startPoint == 'D'
                       || endPoint == 'A' || endPoint == 'B' || endPoint == 'C' || endPoint == 'D';


        if (valid) {
            if( startPoint == endPoint){
                System.out.println(endPoint+" found");
            }
        }
        else if(valid){
            if(startPoint == 'A') {

                switch (endPoint) {
                    case 'B':
                        output = "right: B found";
                        break;
                    case 'C':
                        output = "right > down: C found ";
                        break;
                    case 'D':
                        output = "right > down > right: D found";
                        break;
                    default:
                        output = "invalid";
                }
            }
        }
        else if(startPoint == 'B'){
            switch (endPoint){
                case 'C': output ="down: C found";
                    break;
                case 'D': output ="down > right: D found";
                    break;
                case 'A': output ="down > right > up: A found";
                    break;
                default:
                    output = "invalid";
            }
        }
        else if(startPoint == 'C'){
            switch (endPoint){
                case 'D': output ="right: D found";
                    break;
                case 'A': output ="right > up: A found";
                    break;
                case 'B': output ="right > up > right: B found";
                    break;
                default:
                    output = "invalid";
            }
        }
        else if(startPoint == 'D') {
            switch (endPoint) {
                case 'A':
                    output = "up: A found";
                    break;
                case 'B':
                    output = "up > right: B found";
                    break;
                case 'C':
                    output = "up > right > down: C found";
                    break;
                default:
                    output = "invalid";
            }
        }else{
            output = "invalid";
        }

        System.out.println(output);





    }
}