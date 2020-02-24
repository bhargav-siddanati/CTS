import java.util.*;
class TaxCalculator{
    float basicSalary;
    boolean citizenship;
    float  tax;
    int nettSalary;
    public void calculateTax(){
       tax = 30 * basicSalary/100;
       System.out.println("The Tax of the employee  for  the  " + basicSalary + " is " + tax);
    }

    public void deductTax(){
        nettSalary = (int)(basicSalary - tax);
        System.out.println("The nett salary of the employee  " + nettSalary);
    }
    public void validateSalary(){
        if(basicSalary > 100000 && citizenship == true)
        System.out.println("The salary and citizenship eligibility " + "true");
        else
        System.out.println("The salary and citizenship eligibility " + "false");
    }
}
public class Calculator{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        TaxCalculator cal = new TaxCalculator();
        cal.basicSalary = sc.nextFloat();
        cal.citizenship = sc.hasNextBoolean();
        cal.calculateTax();
        cal.deductTax();
        cal.validateSalary();
    }
}