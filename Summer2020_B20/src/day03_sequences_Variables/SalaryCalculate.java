package day03_sequences_Variables;

public class SalaryCalculate {

    /*

    // variables: salary, tax
                  100000, 0.28

                  totalTax = salary * tax
                  salaryafterTax = salary - totalTax

                  100000, 0.28,
                  100000 * 0.28 = 28000;

*/

    public static void main(String[] args) {
        int salary = 150000;
                double tax = 0.28;
                double totalTax = salary * tax; //28000
        double salaryafterTax = salary - totalTax; //72000

        System.out.println(salaryafterTax);




    }
}
