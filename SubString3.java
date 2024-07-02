import java.util.*;
import java.lang.String;
class  SubString3
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
   String str1=s.nextLine();
   String str2=s.nextLine();
   if(str1.contains(str2))
   {
     System.out.println(str1.indexOf(str2));
    System.out.println(str1.lastIndexOf(str2));
  }
}
}