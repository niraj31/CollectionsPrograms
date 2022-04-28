package DSA;
import java.util.*;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("One");
		lhs.add("Two");
		lhs.add("Three");
		lhs.add("four");
		lhs.add(null);
		
		for(String s : lhs)
		{
			System.out.println(s);
		}
		
		System.out.println(lhs);
		
		lhs.remove(null);
		System.out.println(lhs);

	}

}
