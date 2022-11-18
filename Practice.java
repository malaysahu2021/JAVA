import java.util.*;
class Car {
    public void start()
    {
        System.out.println("engine start");
    }
    void stop()
    {
        System.out.println("engine stop");
    }
    int drive(int howlong)
    {
        return howlong*60;
    }

}
class CarOwner extends Car
{
    void print()
{
        Car ob = new Car();
        ob.start();
        System.out.println("distance travelled"+ob.drive(5));
        ob.stop();
    }

}
class JamesBondCar extends Car
{
    int drive(int howlong)
    {
        return howlong*180;
    }

}
class Practice
{
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.start();
        System.out.println(obj1.drive(5));
        obj1.stop();
        CarOwner obj2 = new CarOwner();
        obj2.start();
        obj2.print();
        obj2.stop();
        JamesBondCar obj3 = new JamesBondCar();
        obj3.start();
        System.out.println(obj3.drive(5));
        obj3.stop();

    }
}
