class perfume implements fog,uspolo
{
  public static void main(String args[])
    {
    perfume pr=new perfume();
    pr.dynamic();
    pr.madrid6();
    }
   //method overriding
    @Override
    public void dynamic()
    {
     System.out.println("Fog Dynamic");
    }
   //method overriding
   @Override
    public void madrid6()
    {
     System.out.println("US Polo Madrid 6");
    }
}

interface fog
{
void dynamic();
}
interface uspolo
{
void madrid6();
}

 
