// Write a Java program to form the largest number from a given list of non
// negative integers
// Example:
// Input :
// nums = {1, 2, 3, 0, 4, 6}
// Output:
// Largest number using the said array numbers: 643210
import java.util.*;
public class Question27 
{
    public static void main(String args[])
    {
        int A[]={6,9,1,3,2};
        int i,j,temp;
        temp=0;
        System.out.println();
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(A[i] <A[j]) {      
                 temp = A[i];    
                 A[i] = A[j];    
                 A[j] = temp;  
            }
        }}
        for(i=0;i<5;i++)
        {
            System.out.print(A[i]);
        }
        
    }
}