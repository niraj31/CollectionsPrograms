package DSA;

import java.util.*;

public class LinkedListMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList al = new LinkedList();
		
		System.out.println("Is LinkedList is empty: "+al.isEmpty());
		System.out.println("LinkedList size: "+al.size());
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		System.out.println("After adding elements: "+al);
		System.out.println("Is LinkedList is empty: "+al.isEmpty());
		
		al.add(1, "Gaurav");
		System.out.println("After adding element: "+al);
		
		al.addFirst("Jayesh");
		System.out.println("After adding element to the first: "+al);
		
		al.addLast("Pritam");
		System.out.println("After adding element to the last: "+al);
		
		LinkedList al2= new LinkedList();
		al2.add("Ramesh");
		al2.add("Suresh");
		
		al.addAll(al2);
		System.out.println("Both LinkedList printed: "+al);
		System.out.println("LinkedList size: "+al.size());
		
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	

	}

}
