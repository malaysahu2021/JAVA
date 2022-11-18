import java.util.*;
class Question15
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A[];
        int i;
        System.out.println("Enter the size of an array");
        int size= sc.nextInt();
        A=new int[size];
        if(size>=2)
        {
            for(i=0;i<size;i++)
            {
               System.out.println("Enter the element of an array");
               A[i]=sc.nextInt();
            }
            if(A[0]==A[size-1])
            {
                System.out.println("Starting and ending elements are same.");
            }
            else
            {
                System.out.println("Starting and ending elements are not same.");
            }
        }
        else
        {
            System.out.println("Inappropriate size of the array.");
        }
        
    }
}
