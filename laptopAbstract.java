class laptop extends asus
{
 public static void main(String args[])
 {
  laptop lp=new laptop();		
  lp.tufgaming();
  lp.asusrog();
  }
  @Override
  public void tufgaming()
  {
  System.out.println("Asus tuf gaming");
  }
}
abstract class asus
{
 abstract void tufgaming();
 public void asusrog()
 {
 System.out.println("Asus Rog");
 }
}