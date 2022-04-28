package DSA;
import java.util.*;
public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> q = new ArrayDeque<String>();
		q.add("Mahesh");
		q.add("Suresh");
		q.add("Jayesh");
		
		for(String s : q)
		{
			System.out.println(s);
		}
		
		q.offerFirst("Rushikesh");
		System.out.println(q);
		q.offerLast("Ramesh");
		System.out.println(q);
		
		q.pollFirst();
		System.out.println(q);
		q.pollLast();
		System.out.println(q);
	}

}
