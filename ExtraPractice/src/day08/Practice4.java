package day08;

public class Practice4 {
    public static void main(String[] args) {

        boolean x = true, z = true;
        int y = 20;
        x = (y!= 10) || (z == false);
        //   true   ||    false
        //        true
        System.out.println(x);

        System.out.println("======================================");

        boolean a = true;
        boolean b = !a;
        boolean c= a != b && a == !b && !a == b;
             //  true != false && true == true && false == false
            //      true       &&      true    &&    true
        System.out.println(c);


    }
}
