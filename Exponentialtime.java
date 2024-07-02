class Factorialtime
{
public static int fun(int n)
{
int c=0;
int r=1;
while(n>=1)
{
r=r*n;
n=n-1;
}
return c;
}
 public static void main(String args[])
{
 int n=10;
System.out.println("n=10, no of instructions o(2^n):" +fun(n));
}
}