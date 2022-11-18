/*
 * Write a Java program to convert a decimal number to hexadecimal number
 */
import java.util.*;
public class classq5
{
Scanner scan;
int num;
void getVal()
{
System.out.println("HexaDecimal to Binary");
scan = new Scanner(System.in);
System.out.println("\nEnter the number :");
num = Integer.parseInt(scan.nextLine(), 16);}
void convert()
{
String binary = Integer.toBinaryString(num);
System.out.println("Binary Value is : " + binary);
}
}
class classq5
{
public static void main(String args[])
{
    classq5 obj = new classq5();
obj.getVal();
obj.convert();
}
}
