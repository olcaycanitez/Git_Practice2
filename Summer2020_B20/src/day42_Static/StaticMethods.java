package day42_Static;

public class StaticMethods {

    int a = 200;
    static int b = 400;

    public static void main(String[] args){
        System.out.println(b);
       // System.out.println(a); doesnt work
        //System.out.println(this.a); doesnt work

        StaticMethods obj = new StaticMethods();
        System.out.println(obj.a);
        // the ONLY way to call instances in a static method

        staticMethod();
        StaticMethods.staticMethod();

        //instanceMethod();
        //StaticMethods.staticMethod();
        obj.instanceMethod();

    }

    public static void staticMethod(){

    }

    public void instanceMethod(){

    }


}
