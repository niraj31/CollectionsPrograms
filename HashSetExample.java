package DSA;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet();
		h.add("one");
		h.add("two");
		h.add("three");
		h.add(null);
		
		Iterator i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(h);
		
		h.remove("two");
		System.out.println(h);
		
		h.removeIf(str->str.contains("one"));
		System.out.println(h);
	}

}
