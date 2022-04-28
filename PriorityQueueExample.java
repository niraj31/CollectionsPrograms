package DSA;

import java.util.*;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq = new PriorityQueue();
		pq.add("Ramesh");
		pq.add("Suresh");
		pq.add("Jayesh");
		pq.add("Mahesh");
		
		System.out.println(pq);
		System.out.println("Head: "+pq.element());
		System.out.println("Head: "+pq.peek());
		
		Iterator i = pq.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		pq.remove();
		
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
	}

}
