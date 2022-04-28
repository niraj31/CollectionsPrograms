package DSA;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRemoveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add("Mahesh");
		ll.add("Suresh");
		ll.add("Ramesh");
		ll.add("Mahesh");
		System.out.println("Initial LinkedList: "+ll);
		
		ll.remove("Mahesh");
		System.out.println("After removing Mahesh: "+ll);
		
		ll.remove(1);
		System.out.println("After removing 1st index element: "+ll);
		
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("Rajesh");
		ll1.add("Sukesh");
		ll1.add("Hitesh");
		ll1.add("Kunal");
		ll.addAll(ll1);
		
		System.out.println(ll);
		
		Iterator i = ll.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		ll.removeFirst();
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		
		ll.removeFirstOccurrence("Mahesh");
		System.out.println(ll);
		
		ll.removeLastOccurrence("Sukesh");
		System.out.println(ll);

	}

}
