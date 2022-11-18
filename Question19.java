import java.util.*;
class Question19
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        int A[]=new int[n];
        int B[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter elements of Array 'A':");
            A[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("Enter elements of Array 'B':");
            B[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for(i=0;i<n;i++)
        {
            System.out.print(B[i]+" ");
        }
        for(i=0;i<n;i++)
        {
            B[i]=(A[i]*B[i]);
        }
        System.out.println();
        for(i=0;i<n;i++)
        {
            System.out.print(B[i]+" ");
        }
    }
}
