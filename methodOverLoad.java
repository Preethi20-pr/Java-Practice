class methodOverLoad{
    public static void main(String args[]){
        addition(2,3);
        addition(2,4,6,7);
    }
    public static void addition(int a,int b){
        System.out.println("First addition "+(a+b));
    }
    public static void addition(int a,int b,int c){
        System.out.println("Second addition "+(a+b+c));
    }
    public static void addition(int a,int b, int c, int d){
        System.out.println("Third addition "+(a+b+c+d));
    }
}