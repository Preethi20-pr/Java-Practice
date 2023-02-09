import java.util.Scanner;
class leap{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
for(int i=1900;i<=2023;i++)
{
if(i%4==0)
{
System.out.println(i);
}
}
}
}