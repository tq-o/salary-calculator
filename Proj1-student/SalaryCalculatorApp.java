import java.util.Scanner;
   /*
    * This class provides a user with a calculation of their annual (yearly)
    * and monthly salary based on their hourly rate of pay and the number of
    * hours worked per week. It uses an instance of a SalaryCalculator to perform
    * the calculations.
    */
public class SalaryCalculatorApp {                         
   public static void main (String [] args) { 
      
      // Create an instance of a SalaryCalculator.
      SalaryCalculator myCalculator = new SalaryCalculator();
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Welcome to Salary Calculator");
      
      System.out.println("Enter your hourly wage:");
      
      double hourlyWage = scan.nextDouble();

      System.out.println("Enter the number of hours you work per week:");
      
      double hoursPerWeek = scan.nextDouble();
                   
      double annualSalary = myCalculator.calculateAnnualSalary(hourlyWage, hoursPerWeek);       
      System.out.printf("Your annual salary is: $%.2f.%n", annualSalary);  
    
      double monthlySalary = myCalculator.calculateMonthlySalary(hourlyWage, hoursPerWeek);       
      System.out.printf("Your monthly salary is: $%.2f.%n", monthlySalary);
   } 
}