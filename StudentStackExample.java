package DSA;
import java.util.*;

class StudentStackEx
{
	int rollNo, marks1, marks2, marks3;
	String name;
	StudentStackEx(int rollNo, String name, int marks1, int marks2, int marks3)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
}

public class StudentStackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentStackEx sse = new StudentStackEx(31, "Mahesh", 88, 92, 86);
		StudentStackEx sse1 = new StudentStackEx(32, "Suresh", 83, 76, 55);
		StudentStackEx sse2 = new StudentStackEx(33, "Mahesh", 84, 75, 67);
		
		Stack s1 = new Stack();
		s1.push(sse);
		s1.push(sse1);
		s1.push(sse2);
		
		Iterator i = s1.iterator();
		while(i.hasNext())
		{
			StudentStackEx s=(StudentStackEx)i.next();
			System.out.println("RollNo: "+s.rollNo+" Name: "+s.name+" Marks: "+s.marks1+" Marks2: "+s.marks2+" Marks3: "+s.marks3);
		}
		s1.pop();
		Iterator i2 = s1.iterator();
		while(i2.hasNext())
		{
			StudentStackEx s=(StudentStackEx)i2.next();
			System.out.println("RollNo: "+s.rollNo+" Name: "+s.name+" Marks: "+s.marks1+" Marks2: "+s.marks2+" Marks3: "+s.marks3);
		}
	}

}
