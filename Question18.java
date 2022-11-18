import java.util.*;
class Question18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter String1:");
        s1=sc.next();
        System.out.println("Enter String2:");
        s2=sc.next();
        s1=s1.substring(1);
        s2=s2.substring(1);
        s1=s1.concat(s2);
        System.out.println("The Concatenated String is: "+s1);
    }
}