class theater{
    public static void main(String args[])
    {
        movie tm=new movie();
        tm.addMovie("Wednesday","Tim Burton",300);
        tm.getMovie();
        movie tm1=new movie();
        tm1.addMovie("Frozen-II","Jennifer Lee",250);
        tm1.getMovie();
    }
}
class movie{
   private int mTicket;
   private String mName, mDirector;
    public void addMovie(String movieName, String movieDirector, int movieTicket)
{
        mName=movieName;
        mDirector=movieDirector;
        mTicket=movieTicket;
    }
    public void getMovie(){
        System.out.println("The movie "+mName+" is directed by "+mDirector+" and it's ticket price is "+mTicket);
    }
}
