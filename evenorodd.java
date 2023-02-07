import java.util.Scanner;
class evenorodd{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your num");
int num=sc.nextInt();
if(num%2==0)
{
System.out.println(num+"is even num");
}
else
{
System.out.println(num+"is odd num");
}
}
}