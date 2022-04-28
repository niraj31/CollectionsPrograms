package DSA;
import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		
		System.out.println(s.isEmpty());
		s.push(85);
		s.push(55);
		s.push(75);
		s.push(35);
		s.push(75);
		s.push(65);
		
		System.out.println(s);
		System.out.println(s.isEmpty());
		
		s.pop();
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.search(55));
		System.out.println(s.size());
		
		
		
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}
	

}
