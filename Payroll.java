public class Payroll
{
   // Constant for the number of employees
   public final int NUM_EMPLOYEES = 7;
   
   // Array of employee ID numbers
   private int[] employeeId = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
   // Array to hold hours worked
   private int[] hours = new int[NUM_EMPLOYEES];

   // Array to hold pay rates
   private double[] payRate = new double[NUM_EMPLOYEES];
   
   // Array to hold wages earned
   private double[] wagesEarned = new double[NUM_EMPLOYEES];

  
public double getGrossPay(int i)
   {
     double grossPay = hours[i]*payRate[i];
     return grossPay;
   }
  
public void setHoursAt(int i, int h)
   {
     hours[i] = h;
   }
   
public void setPayRateAt(int i, double r)
   {
     payRate[i] = r;
   }
public void setWagesAt(int i, double r)
   {
     wagesEarned[i] = r;
   }  

public int getEmployeeIdAt(int i)
   {
     return employeeId[i];
   }
   
public int getHoursAt(int i)
   {
     return hours[i];
   }
}
