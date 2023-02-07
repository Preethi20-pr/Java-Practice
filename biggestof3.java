import java.util.Scanner;
class biggestof3{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the 1st num");
int num1=sc.nextInt();
System.out.println("enter the 2nd num");
int num2=sc.nextInt();
System.out.println("enter the 3rd num");
int num3=sc.nextInt();

if(num1>num2)
{
if(num1>num3)
{
System.out.println(num1+"is biggest num");
}
else
{
System.out.println(num3+"is biggest num");
}
}

else
{
if(num2>num3)
{
System.out.println(num2+"is biggest num");
}
else
{
System.out.println(num3+"is biggest num");
}
}
}
}