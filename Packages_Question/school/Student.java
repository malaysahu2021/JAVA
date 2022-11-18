packages school;
import java.util.*;
class Student
{
	String Name,Reg_Num;
	Scanner in = new Scanner(System.in);

	Student()
	{
		Name=Reg_Num="";
	}

	public void setData()
	{
		System.out.println("Enter Name of Student -->");
		Name = in.nextLine();
		
		System.out.println("Enter Registration Number of Student -->");
		Reg_Num = in.nextLine();	
	}
	
	public void display()
	{
		System.out.println("Name of Student -->"+Student);
		System.out.println("Registrtion Number of Student --> "+Reg_Num);
	}
}