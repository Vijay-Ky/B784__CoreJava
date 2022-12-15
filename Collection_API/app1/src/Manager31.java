import java.util.ArrayList;
import java.util.Iterator;
//import java.util.ListIterator;

public class Manager31 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
/*
 -In case of Enumeration it is only applicable for legacy classes.and it is not universal.
 and we can only perform read operation and we cant perform remove operation.
 To overcome the problems of Enumeration we use Iterator.
 -Iterator we can use for any Collection class. it is universal
 we can perform both read and remove operation.
 -Iterator is an Interface in java.util package.
 -Iterator used to read the elements.
 -while calling list.iterator() we get an object of type iterator.
 -iterator is the method available in Collection interface.
 -inside iterator() method using anonymous inner class to implement iterator interface,
 for that implemented class object is creating and that object is returning to it.
 -hasNext() method informs whether the next element is present or not.
 -next() method reads the next element.
*/