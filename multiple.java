import java.util.Scanner;
class multiple{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a num");
int num=sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(num+"X"+i+"="+(num*i));
}
}
}