package DSA;
import java.util.*;

class Book1
{
	int id,qty;
	String name, author, publisher;
	Book1(int id, String name, String author, String publisher,int qty)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.qty=qty;
	}
}

public class BookDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Book1> d = new ArrayDeque<Book1>();
		
		Book1 b1 = new Book1(11, "ABC", "ABC", "ABC",12);
		Book1 b2 = new Book1(12, "PQR", "PQR", "PQR",10);
		Book1 b3 = new Book1(13, "XYZ", "XYZ", "XYZ",4);
		
		d.add(b1);
		d.add(b2);
		d.add(b3);
		
		for (Book1 bk : d)
		{
			System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher+" "+bk.qty);
		}
	}

}
