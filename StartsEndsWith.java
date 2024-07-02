import java.util.*;
import java.lang.String;
class  StartsEndsWith
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
   String str1=s.nextLine();
   String str2=s.nextLine();
   if(str1.contains(str2))
   {
     System.out.println("String is found");
   }
   else
   {
     System.out.println("String is not found");
   }
  }
}