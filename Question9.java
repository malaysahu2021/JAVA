// Write a Java program that accepts an integer (n) and computes the value
// of n+nn+nnn
import java.util.*;
class Question9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        char A[];
        System.out.println("Enter a string:");
        s=sc.next();
        int l=s.length();
        A=new char[l];
        int i;
        for(i=0;i<l;i++)
        {
            A[i]=s.charAt(i);
        }
        for(i=0;i<l;i++)
        {
            System.out.println(A[i]);
        }
    }
}
