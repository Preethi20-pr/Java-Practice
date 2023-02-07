class name
{
public static void main(String args[])
{
System.out.println("welcome");
greet();
name pr=new name();
pr.display();
}
public static void greet(){
System.out.println("to static");
}
public void display(){
System.out.println("to non static");
}
}


