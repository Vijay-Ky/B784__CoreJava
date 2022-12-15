import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Manager30 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(4);
		list.add(5);
		list.add(0);
		list.add(2);
		System.out.println(list);
		System.out.println("-----");
		Iterator it = list.iterator();//
		// it use reading element from array.
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
		System.out.println();
		System.out.println("--------");
		ListIterator lit = list.listIterator();// it use reading element from array.
		while (lit.hasNext()) {
			System.out.print(lit.next() + ",");// ite
		}

	}
}
/*

Iterator - An Iterator is an object that can be used to loop through collections, like ArrayList, HashSet. 
           it is called iterator because iterating is the technical term for looping.
		   to use an Iterator must import from java.util.Iterator
		   
To get the Iterator we should call iterator() method on any collection object.


Iterator vs ListIterator
1
Iterator is used for traversing List and Set both
but in case of ListIterator we can only traverse List object.
2
we can traverse in only forward direction using Iterator
ListIterator can traverse a List in both direction(forward and backward)
3.
we cant obtain indexes while using Iterator

we can obtain indexes at any point of time while traversing through a list using ListIterator.
for this purpose nextIndex() and previousIndex().

4.
cant add element to collection while using Iterator. throws CME if you try to do it.
we can add element at any point of time while traversing through list using ListIterator

5.
cannot replace the existing element value using Iterator
but by using set method of ListIterator we can replace the last element returned by next() or previous() methods.

6.
Iterator methods
hasNext
next
remove

ListIterator
add
hasNext
hasPrevious
next
nextIndex
previous
previousIndex
remove
set
*/