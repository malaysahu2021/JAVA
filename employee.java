import java.util.*;
public class employee 
{
    String Name,YOJ,Address;
    double Salary;
    
    employee() // default constructor
    {
        Name = YOJ = Address = "";
        Salary=0.0;
    }

    employee(String Name,String YOJ,String Address,double Salary) //Parametrized Constructor
    {
        this.Name = Name;
        this.YOJ = YOJ;
        this.Address = Address;
        this.Salary = Salary;
    }

    void display()
    {
        System.out.println(Name+"\t"+YOJ+"\t"+Address);
    }

    public static void main(String[] args) 
    {
        employee i[] = new employee[3]; //Array of Objects
        Scanner in = new Scanner(System.in);
        String name,yoj,address;
        double salary;

        for(int j=0;j<3;j++)
        {
            System.out.println("Enter Your Name -->");
            name = in.nextLine();
            
            System.out.println("Enter Your Year of Joining -->");
            yoj = in.nextLine();

            System.out.println("Enter Your Address -->");
            address = in.nextLine();
            
            System.out.println("Enter Your Salary -->");
            salary = in.nextDouble();
            
            in.nextLine(); // Used to Clear Memory (Created by ENTER)

            i[j]=new employee(name, yoj, address, salary);
            //i[0] i[1]
        }

        System.out.println("Name\tYOJ\tAddress");
        for(int j=0;j<3;j++)
        i[j].display();
    }
}