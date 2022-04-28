package DSA;
import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		list.add(101);
		list.add("Books");
		list.add(1999.00);
		list.add(101);
		list.add("Books");
		list.add(1999.00);
		
		System.out.println(list);
		
		System.out.println("Get 5th Element: "+list.get(5));
		list.set(4, "Fruits");
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
