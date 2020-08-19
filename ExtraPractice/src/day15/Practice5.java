package day15;

public class Practice5 {

    public static void main(String[] args) {
            String str = "Cybertek";
            //  Scanner input = new Scanner(System.in);

            String name = "Cybertek"; // String literal
            String name2 = new String("Cybertek");

            String s1 = "Cat"; //String literal
            String s2 = "Cat"; //String literal

            System.out.println(s1 == s2);
            //                 "Cat" == "Cat"  ==> true

            String d1 = "Dog";
            String d2 = "dog";
        System.out.println(d1 == d2);

            String t1 = new String("Tiger");
            String t2 = new String("Tiger");

        System.out.println(t1 == t2);

        System.out.println("==================================================");

        String c1 = "Cybertek";
        String c2 = new String("Cybertek");
        String c3 = new String("Cybertek");
        String c4 = "Cybertek";
        String c5 = "cybertek";

        System.out.println(c1 == c2); // false

        System.out.println(c2 == c3); // false

        System.out.println(c1 == c4); // true

        System.out.println(c4 == c5); // false

        System.out.println("=====================================================");

        String str1 = "Java";

        str1 = "Java";

        System.out.println(str1);

        }

    }
