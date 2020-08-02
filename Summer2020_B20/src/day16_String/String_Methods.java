package day16_String;

public class String_Methods {
    public static void main(String[] args) {
        String s1 =  "I like to stay in Cybertek, Cybertek is nice place"; // MIT

        s1 =  s1.replace("Cybertek", "MIT");

        System.out.println(s1);

        s1 = s1.replace("MIT", "Cybertek");

        System.out.println(s1);

        String s2 = " I like to leaRn Java"; // r
        s2 = s2.replace("aRn", "arn");

        System.out.println(s2);


        // replaceFirst:

        String s3 = "I like to drink tea and tea";
        s3 = s3.replaceFirst("tea", "cola");
        System.out.println(s3);

        String s4 = "I like to Watch Game of thrones, and Walking dead ";
        s4 = s4.replaceFirst(", and Walking dead", "");

        System.out.println(s4);




    }

}
