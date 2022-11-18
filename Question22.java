import java.util.*;
class Question22
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int divider;
        int dividend;
        System.out.println("Enter divider");
        divider=sc.nextInt();
        System.out.println("Enter dividend");
        dividend=sc.nextInt();
        int result=0;
        while (dividend >= divider) 
        {
            dividend -= divider;
            result++;
        }
        System.out.println("The result is: "+result);
        
        
    }
}
