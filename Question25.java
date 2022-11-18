import java.util.*;
class Question25
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int i,j,temp;
        int A[]= new int[n];
        String S[]=new String[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter an integer element");
            A[i]=sc.nextInt();
            System.out.println("Enter a string element");
            S[i]=sc.next();

        }
         for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(A[i] <A[j]) {      
                 temp = A[i];    
                 A[i] = A[j];    
                 A[j] = temp;  
            }
        }}
        String temps="";
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(S[i].compareTo(S[j])>1) {      
                 temps = S[i];    
                 S[i] = S[j];    
                 S[j] = temps;  
            }
        }}
        for(i=0;i<n;i++)
        {
            System.out.print(S[i]+ " ");
        }
        System.out.println();
        for(i=0;i<n;i++)
        {
            System.out.print(S[i]+ " ");
        }
    }
}
