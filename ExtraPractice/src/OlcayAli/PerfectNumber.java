package OlcayAli;
/*
A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
Proper positive divisors are positive integers that fully divide the perfect number without leaving
a remainder and exclude the perfect number itself.
6: 1+ 2+ 3 = 6
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" enter a number");
        int num = input.nextInt();

        int sum = 0;

        for(int i =1; i < num; i++) {
            if (num % i == 0) {
                sum += i; // 1+ 2+ 3+ ==> 6
            }
        }if(sum == num){
            System.out.println(num + " is Perfect Number");
        }else{
            System.out.println("Regular Number");
        }
    }

}


