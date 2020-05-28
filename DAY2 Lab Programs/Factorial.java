import java.util.*;

public class Factorial
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter the number");
int n=in.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
fact=i*fact;
}
System.out.println("Factorial of given number"+":"+fact);
}
}
