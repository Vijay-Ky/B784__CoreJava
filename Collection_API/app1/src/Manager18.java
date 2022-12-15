import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Manager18 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(19);
		list.add(91);
		list.add(29);
		list.add(2);
		list.add(25);
		list.add(20);
		System.out.println(list);
		Comparator ctr = Collections.reverseOrder();//sort element in reverse order.
		Collections.sort(list, ctr);
		System.out.println(list);
		//Collections.sort(list);
		//System.out.println(list);
	}
}
/*
 * to sort in the reverse order or in the descending order use Collections.reverseOrder()
 * First sort method accept one argument and expecting every element should be comparable type.
. Second sort method accept two arguments and the second argument should be comparator.
 * */
