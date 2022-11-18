import java.util.*;
class Question21
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A[][]=new int[3][3];
        int transpose[][]=new int[3][3];
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
               System.out.println("Enter the elements of matrix:");
               A[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                transpose[i][j]=A[j][i];
            }
        }
        System.out.println("Original matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }
    }
}