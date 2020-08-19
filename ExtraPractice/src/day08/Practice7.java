package day08;

public class Practice7 {
    public static void main(String[] args) {
        int angle1 = 100;
        int angle2 = 60;
        int angle3 = 20;
        boolean valid = angle1 + angle2 + angle3 == 180;
        boolean invalid = !valid;

        if(valid){
            System.out.println("Valid Triangle");
        }

        if(invalid){
            System.out.println("Invalid Triangle");
        }

    }
}
