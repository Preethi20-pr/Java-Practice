import java.util.*;
class stringToken{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("Iam working with java");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}


}
