// Write a Java program to get the contents of a given string as a character
// array
import java.util.*;
class Question29
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
            System.out.println("Enter a string");
            String s=sc.next();
            int len=s.length();
            int i;
            char ch[]=new char[len];
            for(i=0;i<len;i++)
            {
                ch[i]=s.charAt(i);
            }
            for(i=0;i<len;i++)
            {
                System.out.println(ch[i]);
            }
            
        }
    }
}