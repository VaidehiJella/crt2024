import java.util.*;
import java.lang.String;
class  Split
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
   String str=s.nextLine();
   String res[]=str.split(" ");
   for(int i=0;i<res.length;i++)
   {
     System.out.println(res[i]);
   }
  }
}