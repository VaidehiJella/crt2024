import java.util.*;
import java.lang.String;
class StringAlphaNumeric
{
public static void main(String args[])
{
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0)
        if(Character.isLetterOrDigit(c))
        {
          System.out.println("ALpha-Numeric");
          if(Character.isLetter(c))
          {
               System.out.println("Alphabet");
               if(Character.isUpperCase(c)
               {
                  System.out.println("Upper Case");
               }
               else
               {
                  System.out.println("LowerCase");
                }
           }
           else
           {
               System.out.println("Numeric");
           }
         }
         else
         {
               System.out.println("Special Symbol");
         }    
} 
}