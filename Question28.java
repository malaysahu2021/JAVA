// .Write a Java program to compare two strings lexicographically. Two strings
// are lexicographically equal if they are the same length and contain the
// same characters in the same positions
import java.util.*;
class Question28
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter String1:");
        s1=sc.nextLine();
        System.out.println("Enter String2:");
        s2=sc.nextLine();
        int result= s1.compareTo(s2);
        if(result<0)
        {
            System.out.println(s1 + " is less than " + s2);
        }
        else if(result==0)
        {
            System.out.println(s1 + " is equal to " + s2);
        }
        else if(result>0)
        {
            System.out.println(s1 + " is equal to " +s2);
        }
    }
}