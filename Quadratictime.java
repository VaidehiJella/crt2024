class Logarithmictime
{
public static int fun(int n)
{
int c=0;
for(int i=0;i<=n;i=i*2)
{
c++;
}
return c;
}
 public static void main(String args[])
{
 int n=100;
System.out.println("n=100, no of instructions o(logn):" +fun(n));
}
}