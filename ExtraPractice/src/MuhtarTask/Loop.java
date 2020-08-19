package MuhtarTask;
/*
 1. write a program that can print all even numbers between 0 ~ 1000
 2. write a program that can print all odd numbers between 0 ~ 1000
 3. write a program that can print a~z
 4. write a program that can print A~Z

 */

public class Loop {
    public static void main(String[] args) {

        for(int i = 0; i <=1000; i += 2 ){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int j = 1; j < 1000; j += 2){
            System.out.print(j +" ");
        }


    }
}
