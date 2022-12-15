import java.util.ArrayList;
import java.util.ListIterator;

public class Manager37 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);

		ListIterator lit = list.listIterator();
		//list.add(50);//use it.add(50) to avoid CuncurrentModificationException
		//list.add(50);
		System.out.println("before adding the element");
		while(lit.hasNext())
		{
			System.out.println("In the index: " + lit.nextIndex() + "The element: " + lit.next() + "is present");
		}
		System.out.println(list);
		
		/*
		lit.add(50);
		
		System.out.println("after adding the element");

		while(lit.hasPrevious())
		{
			System.out.println("In the index: " + lit.previousIndex() + "The element: " + lit.previous() + "is present");
		}*/
	}
}
