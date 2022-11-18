// Write a Java program to check if a string starts with the word “Java”
import java.util.*;
class Question20
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a string:");
        s=sc.next();
        System.out.println(s.startsWith("java"));
    }
}