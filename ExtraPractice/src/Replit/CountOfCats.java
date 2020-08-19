package Replit;

import java.util.Scanner;

public class CountOfCats {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
          int countOfCats = 0;
          int countOfDogs = 0;
//        String word = scan.next();

        String word = "cat-cheetah-dog-cat";

        while(word.contains("cat")){
            word = word.replaceFirst("cat", "");
            countOfCats ++;
        }


        while(word.contains("dog")){
            word = word.replaceFirst("dog", "");
            countOfDogs++;
        }

        System.out.println("cat: "+ countOfCats);
        System.out.println("dog: "+ countOfDogs);
        System.out.println(countOfCats == countOfDogs);


    }

}
