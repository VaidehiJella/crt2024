import java.util.*;
import java.lang.String;
class  StringJoin
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String res[]={"C","CPP","Java","Python"};
    String str1=String.join(" ",res);
    System.out.println(str1);
    String str2=String.join("language",res);
    System.out.println(str2);
    String str4=String.join("-",res);
    System.out.println(str4);
    String str3=String.join("",res);
    System.out.println(str3);
  }
}