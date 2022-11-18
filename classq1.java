// 1. Write a Java program to print the sum (addition), multiply, subtract,
// divide and remainder of two numbers.
import java.util.*;
public class classq1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a,b,c,d,e,f;
        System.out.println("enter the first number");
        a=in.nextFloat();
        System.out.println("enter the secound number");
        b=in.nextFloat();
        System.out.println("addition " +(a+b));
        c=a+b;
        System.out.println(c);
        System.out.println("substraction");
        d=a-b;
        System.out.println(d);
        System.out.println("multiplication");
        e=a*b;
        System.out.println(e);
        System.out.println("division");
        f=a/b;
        System.out.println(f);
        in.close();
    }
}