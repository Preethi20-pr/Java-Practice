import java.util.Scanner;
class reverseNum{
public static void main(String args[])
{
int num,rem=0,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a num");
num=sc.nextInt();
while(num!=0)
{
rem=num%10;
sum=sum*10+rem;
num=(num/10);
}
System.out.println("reverse num is"+sum);
}
}