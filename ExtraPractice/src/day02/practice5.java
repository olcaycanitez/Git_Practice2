package day02;

public class practice5 {

    public static void main(String[] args) {
        int bear = 20;
        int snakes = 30;
        int tiger = 40;
        int animal1 = bear++ + ++snakes - ++tiger;
                    // 20    + 31      -41

        int animal2 = --bear - snakes++ + snakes++ - --tiger;
                  //  --bear - snakes++ + snakes++ - --tiger;
                  //    19   - 30       + 31    - 39

        int animal3 = ++bear - bear-- + bear++ + snakes++ - --snakes + tiger-- + tiger-- + ++tiger;
          //animal3 = ++bear - bear-- + bear++ + snakes++ - --snakes + tiger-- + tiger-- + ++tiger;
                   //    21  - 21     + 20     +  30    - 30         + 40     +  39     + 39

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);




    }


}
