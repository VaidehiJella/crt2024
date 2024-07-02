import java.util.*;
import java.lang.String;
class StringAlphaNumeric2
{
public static void main(String args[])
{
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char s2[]=s1.toCharArray();
        int a=0,u=0,l=0,d=0,ss=0;
        for(int i=0;i<s2.length;i++)
       { 
        if(Character.isLetterOrDigit(s2[i]))
        {
          if(Character.isLetter(s2[i]))
          {
                a=a+1;
               if(Character.isUpperCase(s2[i]))
               {
                   u=u+1;
               }
               else
               {
                   l=l+1;
                }
           }
           else
           {
                d=d+1;
           }
         }
         else
         {
                ss=ss+1;
         }  
      }
      System.out.println("no of alphabets" +a+ "no of upper case" +u+ "no of lower case" +l+ "no of digits" +d+ "no of special symbol" +ss);  
} 
}