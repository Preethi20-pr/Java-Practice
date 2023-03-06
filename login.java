import java.util.Scanner;
import java.util.regex.*;
class login
{
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String username,pwd;
      System.out.println("-----login page-----");
      System.out.println("Enter username:");
      username=sc.nextLine();
      System.out.println("Enter password:");
      pwd=sc.nextLine();
      if(Pattern.matches("[a-zA-Z0-9]{4,}",username))
      {
        if(Pattern.matches("[a-zA-Z0-9]{6,}",pwd))
        {
            if(pwd.equals("12345678"))
            {
            System.out.println("Login success");
            }
            else
            {
            System.out.println("Wrong password");
            }
         }
         else
         {
         System.out.println("invalid password");
         }
      }
      else
      {
      System.out.println("invalid username");
      }
   }
}