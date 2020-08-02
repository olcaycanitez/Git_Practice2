package day08_LogicalOperators;

/*
2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785 gallons

 */

public class LittersToGallons {
    public static void main(String[] args) {
        double litters = 1000;
        double gallons = litters/3.785;

        System.out.println(litters +" litters equal to "+ gallons+" gallons");


    }
}
