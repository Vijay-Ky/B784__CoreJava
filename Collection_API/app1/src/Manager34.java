import java.util.ArrayList;
import java.util.Iterator;

public class Manager34 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		Iterator it = list.iterator();
		list.add(50);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list);
	}
}
/*
 *java.util.concurrentmodificationexception is an error in Java.
 The error occurs when the iterator is traversing a list,
 and a command is used to change an element’s value during that traversal.
 * */
