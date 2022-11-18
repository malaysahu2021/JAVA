import java.util.*;
class Triangle {
        Scanner in = new Scanner(System.in);
        double a,b,c;
    Triangle()
    {
        a=b=0;
    }
    Triangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double Area()
    {
        double s=(a+b+c)/2;
        double A;
        A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return A; 
    } 
    double perimeter()

    {
        return a+b+c;
    }
    void input()
    {
        double a,b,c;
        System.out.println("enter value of a");
        a = in.nextDouble();
        System.out.println("enter value of b");
        b = in.nextDouble();
        System.out.println("enter value of c");
        c = in.nextDouble();

        this.a=a;
        this.b=b;
        this.c=c;

    }

}
class TriangleDemo
{
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.input();

        System.out.println("area is"+obj.Area());
        
        System.out.println("perimeter is"+obj.perimeter());

        Triangle obj1 = new Triangle(2,3,4);

        System.out.println("area is"+obj1.Area());
        
        System.out.println("perimeter is"+obj1.perimeter());

    }
}