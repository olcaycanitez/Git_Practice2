package Office_Hours.Practice_06_17_2020;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean r1 = !true != true;
        //            false != true ==> true

        System.out.println(r1);
        boolean r2 = !r1;

        System.out.println(r2);
        System.out.println(!!!!!false); // true

        System.out.println("========================================");

        boolean result1 = 9 > 10 || "Java" == "Java" || 'A' == 'a';
        //                 false ||    true          || false
        //                            true
        System.out.println(result1);

        boolean result2 = "Java" != "Pyhthon" && "Muhtar" == "Good Guy";
//                              true          &&         false
        //                                   false
        System.out.println(result2);

    }

}
