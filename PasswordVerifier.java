//
/**
 * Chapter 8
 * Programming Challenge 5: Password Verifier
 * The PasswordVerifier class stores data about
 * a user's password.
 */

public class PasswordVerifier
{
   // Constant for minimum password length
   public static final int MIN_PASSWORD_LENGTH = 6;
   
   
   
   
   
   /**
    * isValid method
    */
   
   public static boolean isValid(String str)
   {
      boolean status; // Validity status
      
      if (str.length() >= MIN_PASSWORD_LENGTH && hasUpperCase(str) && hasLowerCase(str) && hasDigit(str))
         status = true;
      else
         status = false;
         
      return status;
   }

   /**
    * hasUpperCase method
    */
   
   private static boolean hasUpperCase(String str)
   {
     boolean hasUppercase = !str.equals(str.toLowerCase());
     if(!hasUppercase) {return false;} else{return true;} 
   }

   /**
    * hasLowerCase method
    */
   
   private static boolean hasLowerCase(String str)
   {
      boolean hasLowerCase = !str.equals(str.toUpperCase());
     if(!hasLowerCase) {return false;} else{return true;} 
   }
   
     

   /**
    * hasDigit method
    */
   
   private static boolean hasDigit(String str)
   {
     if(str.matches(".*\\d.*")){
       return true;
} else{
   return false;
}
}
}
