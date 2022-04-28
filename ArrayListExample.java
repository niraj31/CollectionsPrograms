package DSA;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
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
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Banana");
		al.add("Grapes");
		al.add("Kiwi");
		al.add("Orange");
		al.add("Mango");
		
		Collections.sort(al);
		System.out.println(al);
		
		for(String s : al)
		{
			System.out.println(s);
		}
	}

}
