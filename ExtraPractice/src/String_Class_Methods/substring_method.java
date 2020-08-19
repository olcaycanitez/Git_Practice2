package String_Class_Methods;

public class substring_method {

    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 0123456789..

        // substring(beg index/ end index)
        String word = sentence.substring(0 , 10+1);

        String first = sentence.substring(0 , 4);
        String last =  sentence.substring(8 , 10);

        sentence = sentence.substring(0 , 4) + sentence.substring(8 , 11);

        System.out.println(sentence);








    }


}
