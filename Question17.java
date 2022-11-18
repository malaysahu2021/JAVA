import java.util.*;
class Question17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.next();
        int l=s.length();
        int half=(l-1)/2;
        int i;
        for(i=0;i<=half;i++)
        {
            System.out.print(s.charAt(i));
        }
    }
}