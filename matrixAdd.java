import java.util.Scanner;
class matrixMultiplication{
    public static void main(String args[]){
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();//READING NO.OF ROWS
        System.out.println("Enter number of cols");
        int cols=sc.nextInt();//READING NO. OF COLUMNS
        int arr[][]=new int[rows][cols];
        int brr[][]=new int[rows][cols];
        int mul[][]=new int[rows][cols];
        //TO ASSIGN FIRST ARRAY VALUES
        System.out.println("Enter first array values");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
      //TO ASSIGN SECOND ARRAY VALUES
        System.out.println("Enter second array values"); 
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                brr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        //DOING MULTIPLICATION OF MATRIX
       for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                for(k=0;k<cols;k++)
                {
                mul[i][j]+=arr[i][k]*brr[k][j];
                }
            }
        }
        //PRINTING RESULT OF MULTIPLICATION 
        System.out.println("Multiplication of matrix is: ");
        
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
               
                for(k=0;k<cols;k++)
                { 
                System.out.print(mul[i][j]+" ");
                }
            }
            System.out.println();
        }        
    }   

}