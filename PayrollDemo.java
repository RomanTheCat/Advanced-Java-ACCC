import java.util.Scanner;
import java.text.DecimalFormat;



public class PayrollDemo
{
   public static void main(String[] args)
   {
      int hours;        
      double payRate;   

      
 
      Scanner k = new Scanner(System.in);
      
      

      Payroll pr = new Payroll();
      
      
      for (int i = 0; i < pr.NUM_EMPLOYEES; i++)
      {
         
         System.out.print("Enter the hours worked by employee number: " + pr.getEmployeeIdAt(i)+"\n");
         hours = k.nextInt();
         
         
         while (hours < 0)
         {
            System.out.print("ERROR: Enter 0 or greater for hours:\n ");
            hours = k.nextInt();
         }
         
          pr.setHoursAt(i, hours);
      }
      
        
        for (int i = 0; i < pr.NUM_EMPLOYEES; i++)
      {
         
         System.out.print("Enter the hourly pay rate for employee number: " + pr.getEmployeeIdAt(i)+"\n ");
         payRate = k.nextDouble();
         
         
 while (payRate < 6 )
         {
            System.out.print("ERROR: Enter 6 or greater for pay rate:\n ");
            payRate = k.nextInt();
         }
            pr.setPayRateAt(i, payRate);
      }
               
      
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
                  
      for (int i = 0; i < pr.NUM_EMPLOYEES; i++)
      {
         System.out.println("Employee ID: " + pr.getEmployeeIdAt(i) +" Wages Earned: $" + dollar.format(pr.getGrossPay(i)) + "\n");
        
      }
   }
}
