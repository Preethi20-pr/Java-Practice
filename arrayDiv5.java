import java.util.Scanner;
class arrayDiv5{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter num of elements in array");
int ns=sc.nextInt();
int arr[]=new int[ns];
System.out.println("enter array elements");
for(int i=0;i<ns;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("array elements are");
for(int dummy:arr)
{
if(dummy%5==0)
{
System.out.println(dummy);
}
}
}
}
