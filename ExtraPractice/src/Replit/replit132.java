package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class replit132 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        float sum = 0;

        for(int i = 0; i < 7; i++){
            System.out.println("Enter score for judge "+ (i + 1) + ":");
            score[i] = input.nextFloat();
            sum += score[i];
        }
        System.out.println("Enter difficulty:");
        float dif = input.nextFloat();

        Arrays.sort(score); // min score[0] , max score[6]
        sum = sum - score[6] - score[0]; // tremainzing sum...

        float total = (sum * dif) * 0.6f;

        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total); //




    }

}
