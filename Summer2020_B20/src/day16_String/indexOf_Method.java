package day16_String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class indexOf_Method {
    public static void main(String[] args) {
        String s5 = "I like to stay in cybertek, we are learning java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re"); // returns the first char 'r' index
        int r3 = s5.indexOf("rn");


        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        String s6 = "Java is a programming language, and Java is fun";

        int I1 = s6.indexOf("J");
        int I2 = s6.lastIndexOf("J");


        System.out.println(I1);
        System.out.println(I2);

        String s7 = "Java";
           int a1 = s7.indexOf("A");

        System.out.println(a1);


    }

}
