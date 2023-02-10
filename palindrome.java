import java.util.Scanner;
class palindrome{
public static void main(String args[])
{
int num,rem=0,sum=0,cpynum;
Scanner sc=new Scanner(System.in);
System.out.println("enter a num");
num=sc.nextInt();
cpynum=num;
while(num!=0)
{
rem=num%10;
sum=sum*10+rem;
num=(num/10);
}
if(cpynum==sum)
{
System.out.println(" given num is palindrome num is" +cpynum);
}
else{
System.out.println(" given num is  not a palindrome num is" +cpynum);
}
}
}