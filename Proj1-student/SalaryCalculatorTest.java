import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.*;


public class SalaryCalculatorTest {

   private SalaryCalculator testCalc;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      testCalc = new SalaryCalculator();
   }
   
   
   /** Test that the variable workingWeeksPerYear has been initialized to 50 in the constructor. **/
   
   @Test public void workingWeeksPerYearInitTest() {
      int testVal=0;
      Class<?> c = testCalc.getClass();
      try{
         Field field = c.getDeclaredField("workingWeeksPerYear");
         field.setAccessible(true);
         testVal = field.getInt(testCalc);
      } catch (NoSuchFieldException nsfex) {
	       nsfex.printStackTrace();
	   } catch (IllegalAccessException iaex) {
	       iaex.printStackTrace();
	   }
      assertEquals("Test 1: The instance variable workingWeeksPerYear has not been initialized to 50.", 50, testVal);
   }    
   
   /** Test that the variable monthsPerYear has been initialized to 12 in the constructor. **/
   @Test public void monthsPerYearInitTest() {
      int testVal=0;
      Class<?> c = testCalc.getClass();
      try{
         Field field = c.getDeclaredField("monthsPerYear");
         field.setAccessible(true);
         testVal = field.getInt(testCalc);
      } catch (NoSuchFieldException nsfex) {
	       nsfex.printStackTrace();
	   } catch (IllegalAccessException iaex) {
	       iaex.printStackTrace();
	   }
      assertEquals("Test 2: The instance variable monthsPerYear has not been initialized to 12.", 12, testVal);
   }
   
   /** Test the calculateAnnualSalary method. **/
   @Test public void calculateAnnualSalaryCorrectTest() {
      double annSal = testCalc.calculateAnnualSalary(20, 40);
      assertEquals("Test 3: calculateAnnualSalary with rate 20, hrs/week 40.", 40000.00, annSal, .01);
   }  
   
    /** Test the calculateMonthlySalary method. **/
   @Test public void calculateMonthlySalaryCorrectTest() {
      double monthSal = testCalc.calculateMonthlySalary(20, 40);
      assertEquals("Test 4: calculateMonthlySalary with rate 20, hrs/week 40.", 3333.33, monthSal, .01);
   } 
 
}
