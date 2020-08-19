package day15;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        int fullLatter = txt.length();
        int lastLetter = fullLatter - 1;
        String word = txt.substring(0 , lastLetter );

        System.out.println(word);

    }


}
