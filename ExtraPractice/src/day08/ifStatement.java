package day08;

public class ifStatement {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;


        if( a > b ){ // if false doesn't print out anythink;
            System.out.println(a + " is the maximum number");

        }
        if(b > a){ // if false doesn't print out anythink;
            System.out.println(b + " is the maximum number");
        }
        if(a == b){
            System.out.println("Both are equel");
        }

        System.out.println("==============================================");

        boolean BreakTime = true;

        if(BreakTime == true){
            System.out.println("Take 15 minutes break!");
        }
        if(BreakTime == false){
            System.out.println("Keep Studying");
        }
    }
}
