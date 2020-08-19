package Replit;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String split = scan.nextLine();

        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt(); // 4

        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();

        scan.nextLine();

        System.out.println("Service Quality:");
        String serviceQuality = scan.nextLine();

        String people = "";

        for(int i = 1; i <= numberOfPeople; i++){
            people += "&";
        }

        double tip = 0;

        if(serviceQuality.equalsIgnoreCase("Poor")){
            tip = checkAmount * 0.05;
        }else if(serviceQuality.equalsIgnoreCase("Fair")){
            tip = checkAmount * 0.10;
        }else if(serviceQuality.equalsIgnoreCase("Good")){
            tip = checkAmount * 0.15;
        }else if(serviceQuality.equalsIgnoreCase("Great")){
            tip = checkAmount * 0.20;
        }else if(serviceQuality.equalsIgnoreCase("Excelent")) {
            tip = checkAmount * 0.25;
        }

        System.out.println("Number of people entered: "+people);
        System.out.println("Total to pay: "+ (checkAmount+tip));
        System.out.println("Total tip: "+tip);
        System.out.println("Total per person: "+ ((checkAmount+tip)/ numberOfPeople));
        System.out.println("Tip per person: "+ (tip/numberOfPeople));


    }
}
