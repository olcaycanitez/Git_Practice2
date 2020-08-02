package day06_ComparisonOperators;

/*
ex:
if : rate = 55;
     stateTaxRate = 0.04;
     federalTaxRate = 0.22;
     weeklyHours = 40;

     then outout will be;
            your salary is: 105600 USD
            your total tax is: 27456 USD
            your income after tax is: 78144 USD

      Assume that a year has 48 weeks (excluding PTO)

      Salary:   rate * weeklyHours * 48
      totalTax:   salary * ( stateTax + federalTax)
      salaryAfterTax:  salary - totalTax


 */
public class SalaryCalculator {

    public static void main(String[] args) {
        double rate = 55;
        double stateTax = 0.0725;
        double federalTaxRate = 0.22;
        int weeklyHours = 40;

        double salary = rate * weeklyHours * 48;
        double totalTax = salary * (stateTax + federalTaxRate);
        double salaryAfterTax = salary - totalTax;

        System.out.println("Salary before tax: " + salary + " USD");
        System.out.println("Total Tax: " + totalTax + " USD");
        System.out.println("Take Home Salary: " + salaryAfterTax + " USD");

    }




}
