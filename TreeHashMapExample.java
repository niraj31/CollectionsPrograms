package DSA;

import java.util.*;

public class TreeHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap m = new TreeMap();
		m.put(1, "Mahesh");
		m.put(2, "Jayesh");
		m.put(3, "Suresh");
		m.put(4, "Ramesh");
		
		Set s=m.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			Map.Entry entry = (Map.Entry) i.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
