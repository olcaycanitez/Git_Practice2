package day09;

public class Maximum {
    public static void main(String[] args) {
        double a = 500;
        double b = 200;
        double c = 300;

        boolean aIsMax = a > b && a > c;
        //               true  && true ==> true
        boolean bIsMax = b > a && b > c;
        //               false && false ==> false
        boolean cIsMax = c > a && c > b;
        //               false && true ==> true

        double max = 0;

        if(aIsMax){
            //System.out.println(a);
            max = a;
        }

        if(bIsMax){
           // System.out.println(b);
            max = b;
        }
        if(cIsMax){
           // System.out.println(c);
            max = c;
        }
        System.out.println(max + " is maximum number");




    }
}
