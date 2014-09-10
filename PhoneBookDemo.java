import java.util.Scanner;
import java.util.ArrayList;



public class PhoneBookDemo
{
   public static void main(String args[])
   {
      
      final int NUM_ENTRIES = 5;
        
      
      ArrayList<PhoneBookEntry> list = new ArrayList<PhoneBookEntry>();
             
      
      System.out.println("I'm going to ask you to enter " + NUM_ENTRIES + " names and phone numbers.\n");
     
      
      
      for (int i = 0; i < NUM_ENTRIES; i++)
      {
        list.add(getEntry());
      }
      
      System.out.println("Here's the data you entered:");
      
     
      for (int i = 0; i < list.size(); i++)
      {
        displayEntry(list.get(i));
      }
          
   }
   
   
    
   public static PhoneBookEntry getEntry()
   {
      
      Scanner keyboard = new Scanner(System.in);
      
      
      String name;
      String phoneNumber;
      
      
      System.out.print("Enter a person's name: ");
      name = keyboard.nextLine();
      System.out.print("Enter " +name +"'s phone number: ");
      phoneNumber = keyboard.nextLine();
      
      
      PhoneBookEntry entry = new PhoneBookEntry(name, phoneNumber);
      
      
      return entry;
   }
   
  
    
   public static void displayEntry(PhoneBookEntry entry)
   {
      System.out.println("------------------------------");
      System.out.println("Name: " + entry.getName());
      System.out.println("Phone number: " + entry.getPhoneNumber());
   }
}
