import java.util.Scanner;
class leapyr{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your year");
int yr=sc.nextInt();
if(yr%4==0)
{
System.out.println(yr+"is leap year");
}
else
{
System.out.println(yr+"is not a leap year");
}
}
}