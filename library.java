class library{
    public static void main(String args[])
    {
        bookShell bs=new bookShell();
        bs.setBook(123,"The Immortale of Meluha","Amish Tripathi",150);
        bs.getBook();
        bookShell bs1=new bookShell();
        bs1.setBook(1234,"Chanakya's chant","Ashwin",250);
        bs1.getBook();
    }
}
class bookShell{
   private int bNum,bPrice;
   private String bName,bAuthor;
    public void setBook(int bookId,String bookName,String bookAuthor,int bookPrice)
{
        bNum=bookId;
        bName=bookName;
        bAuthor=bookAuthor;
        bPrice=bookPrice;
    }
    public void getBook(){
        System.out.println(bNum+" is "+bName+" witten by "+bAuthor+" and it's price is "+bPrice+"Rs");
    }
}
