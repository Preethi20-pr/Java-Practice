import java.util.Scanner;
class transposeMatrix{
    public static void main(String args[]){
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();//READING NO. OF ROWS
        System.out.println("Enter number of cols");
        int cols=sc.nextInt();//READING NO.OF COLUMNS
        int arr[][]=new int[rows][cols];
        //READING ARRAY VALUES
        System.out.println("Enter first array values");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
      
        //PRINTING VALUES OF MATRIX
      System.out.println("Matrix of array is");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } 
      //PRINTING TRANSPOSE OF MATRIX
       System.out.println(" Transpose of Matrix is");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }               
    }   

}