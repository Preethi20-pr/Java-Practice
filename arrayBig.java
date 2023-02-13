import java.util.Scanner;
class arrayBig{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter num of elements in array");
int ns=sc.nextInt();//to get length of array
int arr[]=new int[ns];//to create an array with specific length
System.out.println("enter array elements");
for(int i=0;i<ns;i++)
{
arr[i]=sc.nextInt();//to assign values to array
}
int big=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>big)
{
big=arr[i];
}
}
System.out.println("the biggest num is "+big);
}
}

