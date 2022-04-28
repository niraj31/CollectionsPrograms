package DSA;
import java.util.*;
class Book11
{
	int id,qty;
	String name, author, publisher;
	Book11(int id, String name, String author, String publisher,int qty)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.qty=qty;
	}
}
public class LinkedHashSetBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Book11> l1 = new LinkedHashSet<Book11>();
		
		Book11 b1 = new Book11(11, "ABC", "ABC", "ABC",12);
		Book11 b2 = new Book11(12, "PQR", "PQR", "PQR",10);
		Book11 b3 = new Book11(13, "XYZ", "XYZ", "XYZ",4);
		
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		
		for(Book11 b : l1)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.qty);
		}

	}

}
