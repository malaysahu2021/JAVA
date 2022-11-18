// .Write a Java program to return a new string using every character of even
// positions from a given string
import java.util.*;
class Question30
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,newString;
        newString="";
        System.out.println("Enter a string");
        s=sc.next();
        int l=s.length();
        int i;
        for(i=0;i<l;i++)
        {
            if(i%2==0)
            {
                newString= newString+ s.charAt(i);
            }
        }
        System.out.println("The new String Formed is;"+newString);
    }
}