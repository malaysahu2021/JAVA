import java.util.*;
public class paper 
{
    static int a,b; //Global Variables

    static void add(int a,int b)
    {
        System.out.println(a+b);
    }

    static void substract(int a,int b) //Local Variables
    {
        System.out.println(a>b?a-b:b-a);
    }

    void print()
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Two Values!");
        a=in.nextInt();
        b=in.nextInt();
        
        add(a, b);
        substract(a, b);
    }
}
/*
 * next() - Word
 * nextLine() - Line <Untill you press Enter>
 * nextLine().charAt(0);
 * 
 * charAt(<int><index>) - Returns a Character in a String at the Given Index
 * 
 * for Eg -->
 * If the given String is "ABCD"
 * 
 * "ABCD".charAt(0) --> 'A' (In character form)
 * 
 *    <condition >? <If True> : <If False>
 * 
 * In case of A Non-Static Call we need to Create Object of that class
 * 
 * How to Create Object of a Class --> <ClassName> <id> = new <ClassName>();
 * 
 * We can Call Static function from Another Static Function Directly i.e. Without Object Creation just by following the Signature
 * 
 * Non-Static Functions Can Access Static Gloabl Variables
 */