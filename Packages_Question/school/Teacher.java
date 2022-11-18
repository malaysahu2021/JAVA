packages school;
import java.util.*;
class Teacher
{
	String Name,Emp_ID;
	Scanner in = new Scanner(System.in);

	Student()
	{
		Name=Emp_ID="";
	}

	public void setData()
	{
		System.out.println("Enter Name of Student -->");
		Name = in.nextLine();
		
		System.out.println("Enter Employee ID of Student -->");
		Emp_ID = in.nextLine();	
	}
	
	public void display()
	{
		System.out.println("Name of Teacher -->"+Student);
		System.out.println("Employee ID of Teacher --> "+Emp_ID);
	}
}