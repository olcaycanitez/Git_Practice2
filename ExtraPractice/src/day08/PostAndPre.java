package day08;
/*
manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
 */
public class PostAndPre {
    public static void main(String[] args) {
            int a = 200;
            int b = -a++ + - --a * a-- %2;
            //      -200 - 200 * 200 % 2
            //      -200 -   40000  % 2
            //       -200  - 0
            //          -200
        System.out.println(b);
        System.out.println(a);


        System.out.println("============================================");
            int x = 300;
            int y = 400;
            int z = x + y - x * y + x / y;
            //      300 + 400 - 300 * 400 + 300/400;
        //          300 + 400 - 120000 + 0.75  // int==>0
        // 119300
        System.out.println(z);




    }
}
