import java.util.Scanner;
class big{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first num");
int num1=sc.nextInt();
System.out.println("enter the 2nd num");
int num2=sc.nextInt();
if(num1>num2)
{
System.out.println(num1+"is biggest num");
}
else
{
System.out.println(num2+"is biggest num");
}
}
}