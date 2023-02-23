class varargs{
    public static void main(String args[]){
        addition(2,7,8,9,12,24);
    }
    public static void addition(int ...a)
    {
        int sum=0;
        for(int i:a)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}