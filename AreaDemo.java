import java.util.*;


class Area {
    Scanner in = new Scanner(System.in);
    double l,b;
    void setDim()
    {
        System.out.println("enter the length");
        l= in.nextDouble();
        System.out.println("enter the breadth");
        b= in.nextDouble();
    }
    double getArea()
    {
        return l*b;

    }
    
}
class AreaDemo
{
    public static void main(String[] args) {
        Area obj= new Area();
    obj.setDim();
    System.out.println("the area is "+obj.getArea());
        
    }
    
}
