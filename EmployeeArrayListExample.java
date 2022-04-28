package DSA;
import java.util.*;

class EmployeeExample
{
	int age;
	String employeeName;
	float salary;
	EmployeeExample(int age, String employeeName, float salary)
	{
		this.age=age;
		this.employeeName=employeeName;
		this.salary=salary;
	}
}

public class EmployeeArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeExample e1 = new EmployeeExample(27, "Suresh", 28030.203f);
		EmployeeExample e2 = new EmployeeExample(28, "Ramesh", 32786.603f);
		EmployeeExample e3 = new EmployeeExample(26, "Mahesh", 25678.55f);
		
		ArrayList<EmployeeExample> eal = new ArrayList<EmployeeExample>();
		eal.add(e1);	eal.add(e2);	eal.add(e3);
		
		Iterator i = eal.iterator();
		while(i.hasNext())
		{
			EmployeeExample ex = (EmployeeExample) i.next();
			System.out.println(ex.age+" "+ex.employeeName+" "+ex.salary);
		}
	}

}
