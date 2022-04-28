package DSA;
import java.util.*;

class Book
{
	int id;
	String name, author, publisher;
	Book(int id, String name, String author, String publisher)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
	}
}

public class QueueBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Book> pq1 = new PriorityQueue<Book>();
		
		Book b1 = new Book(11, "ABC", "ABC", "ABC");
		Book b2 = new Book(12, "PQR", "PQR", "PQR");
		Book b3 = new Book(13, "XYZ", "XYZ", "XYZ");
		
		pq1.add(b1);
		pq1.add(b2);
		pq1.add(b3);
		
		Iterator i = pq1.iterator();
		while(i.hasNext())
		{
			Book bb=(Book) i.next();
			System.out.println(bb.id+bb.name+bb.author+bb.publisher);
		}
		

	}

}
