package StringMethods;


import java.util.Scanner;

public class charAtMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };


        for(int i = temps.length-1; i >=0; i-- ){
            total += temps[i];
        }

        avgTemp = total / (double)temps.length;

        System.out.println(avgTemp);



    }



}
