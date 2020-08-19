package day15;

public class Practice6 {
    public static void main(String[] args) {

        String name = "Cybertek School is a great place";
        //             01234567
        // charAt(index):
        char ch1 = name.charAt(0);
        char ch2 = name.charAt(5);

        System.out.println(ch1);
        System.out.println(ch2);

        // length() ==> int

        int l =name.length();

        System.out.println(l);

        int lastIndexNumber = name.length() - 1;

        System.out.println(lastIndexNumber);

        char chr3 = name.charAt(lastIndexNumber);

        System.out.println(chr3);

        // concat():

        String schollName = "Cybertek";
        schollName = schollName.concat(" School");

        System.out.println(schollName);

        String  r1 = "Cybertek" + 123+ 'A' + true;

        System.out.println(r1);

        String r2 = "Cybetek".concat(" School");

        System.out.println(r2);

        // toLowerCase():

        String name1 = "CYBERTEK SCHOOL";
               name1 =  name1.toLowerCase();         // "cybertek school"

        System.out.println(name1);

        // toUpperCase():

        String name2 = "cybertek school";
        name2 = name2.toUpperCase();                // "CYBERTEK SCHOOL"

        System.out.println(name2);

        // trim():

        String schoolName2 = "   Cybertek School    ";
        schoolName2 = schoolName2.trim();

        System.out.println(schoolName2);






    }

}
