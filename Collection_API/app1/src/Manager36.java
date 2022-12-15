import java.util.ArrayList;
import java.util.ListIterator;

public class Manager36 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		ListIterator it = list.listIterator();

		while (it.hasNext()) {
			System.out.println(it.next() + ",");
		}
		System.out.println();
		System.out.println("------");
		while (it.hasPrevious()) {
			System.out.println(it.previous() + ",");
		}
		System.out.println();
		System.out.println("------");
		while (it.hasNext()) {
			System.out.println(it.next() + ",");
		}
		System.out.println();
		System.out.println("------");

	}
}
/*
 * -ListIterator interface extends Iterator Interface.
 -listIterator() method is available in List interface.
 -Unlike Enumeration and Iterator ListIterator interface is bidirectional cursor i,e 
 either we can move forward or backward direction.
- Using ListIterator we can perform read, remove, replacement, addition of new objects.
-while calling list.listIterator() we get an object of type Listiterator.
-inside ListIterator() method using anonymous inner class to implement ListIterator interface,
 for that implemented class object is creating and that object is returning to it.

--------forward direction methods-------
public boolean hasNext()
public Object next()
public int nextIndex()

---------backward direction methods--------
public boolean hasPrevious()
public Object previous()
public int previousIndex()

------Limitation------------
-it is applicable for only List implemented class objects and it is not a universal cursor.	
*/
