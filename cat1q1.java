import java.util.Scanner;

import jave.util.*;
class Customer {
    Scanner in;
    int id,discount
    String name;

    int getID()
    {
        return id;
    }
    int getName()
    {
        return name;
    
    }
    int getDiscount()
    {
        return discount;

    }
    void setDiscount()
    {
        int sd;
        System.out.println(x:"enter the discount");
        sd = new Scanner(System.in).nextInt()
        discount=sd;
    }
    String toString()
    {
        return name+ " "+id+" "+discount" % ";
    }
    
}
class Invoice
{
    int id;
    Scanner in = new scanner (System.in);
    Customer customer;
    double amount;
    Invoice(Customer c,double a)
}