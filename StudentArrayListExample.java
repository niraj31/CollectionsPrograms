package DSA;
import java.util.*;

class StudentExample
{
	int rollNo, age;
	String name;
	StudentExample(int rollNo, String name, int age)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}
}
public class StudentArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentExample se1 = new StudentExample(31,"Mahesh",22);
		StudentExample se2 = new StudentExample(32,"Ramesh",21);
		StudentExample se3 = new StudentExample(33,"Suresh",22);
		
		ArrayList al = new ArrayList();
		al.add(se1);
		al.add(se2);
		al.add(se3);
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			StudentExample st= (StudentExample) itr.next();
			System.out.println(st.rollNo+" "+st.name+" "+st.age);
		}
	}

}
