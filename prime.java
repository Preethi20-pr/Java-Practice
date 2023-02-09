import java.util.Scanner;
class prime{
public static void main(String args[])
{
int count;
Scanner sc=new Scanner(System.in);
System.out.println("enter a num");
int num=sc.nextInt();
count=0;
for(int i=1;i<=100;i++)
{
if(num%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println(num+"is prime");
}
else
{
System.out.println(num+"is not a prime");
}
}
}
