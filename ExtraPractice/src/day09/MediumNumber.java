package day09;

public class MediumNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aIsMedium = (a > b && a < c) || (a > c && a < b);
        boolean bIsMedium = (b < a && b > c) || ( b > a && b < c);
        boolean cIsMedium = aIsMedium == false && bIsMedium == false ;

        double medium = 0;

        if(aIsMedium){
            medium = a;
        }
        if(bIsMedium){
            medium = b;
        }
        if(cIsMedium){
            medium = c;
        }
        System.out.println(medium + " is medium number");



    }
}
