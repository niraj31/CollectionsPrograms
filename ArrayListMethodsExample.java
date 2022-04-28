package DSA;

import java.util.*;

public class ArrayListMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		System.out.println("Is arraylist is empty: "+al.isEmpty());
		System.out.println("Arraylist size: "+al.size());
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		System.out.println("After adding elements: "+al);
		System.out.println("Is arraylist is empty: "+al.isEmpty());
		
		al.add(1, "Gaurav");
		System.out.println("After adding element: "+al);
		
		ArrayList al2= new ArrayList();
		al2.add("Ramesh");
		al2.add("Suresh");
		
		al.addAll(al2);
		System.out.println("Both arrayList printed: "+al);
		System.out.println("Arraylist size: "+al.size());
		
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	

	}

}
