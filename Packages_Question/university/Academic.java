package university;
//Class for calling from one package to another package
import school.*;
import java.util.*;

class Academic 
{
	Student S = new Student();
	Teacher T = new Teacher();

	void set() 
	{
		S.setData();
		T.setData();
	}

	void display() 
	{
		S.display();
		T.display();
	}

	public static void main(String args) 
	{
		Academic A = new Academic();

		A.set();
		A.display();
	}
}