class finalUse
{
    public static void main(String args[])
    {

     final int num=10;
     System.out.println(num);
     //num=15;
     System.out.println(num);
     SBI s=new SBI();
     s.fixeddeposit();	
     }

}

class RBI
{
   public final void fixeddeposit()
   {
   System.out.println("Fixed deposit in RBI");
   }

}
class SBI extends RBI
{
   public void fixeddeposit()
   {
   System.out.println("Fixed deposit in SBI");
   }
}