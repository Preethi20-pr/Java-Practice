class college implements library
{
  public static void main(String args[])
   {
   college clg=new college();
    clg.scificbooks();
    clg.fictionbooks();
   }
  //method overriding
   @Override
   public void scificbooks()
   {
    System.out.println("Science fiction books");
    }
  //method overriding
   @Override
   public void fictionbooks()
   {
    System.out.println("fiction books");
    }
}
interface library
{
int i=10;
  void scificbooks();
  void fictionbooks();
}
