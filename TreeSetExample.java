package DSA;
import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> s = new TreeSet();
		s.add("Suresh");
		s.add("Ramesh");
		s.add("Jayesh");
		s.add("Mahesh");
		
		System.out.println(s);
		
		Iterator i = s.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("FirstElement: "+s.pollFirst());
		System.out.println("LastElement: "+s.pollL());
		

	}

}
