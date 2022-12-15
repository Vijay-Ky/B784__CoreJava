import java.util.ArrayList;
import java.util.Collections;

public class Manager17 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(19);
		list.add(91);
		list.add(29);
		list.add(2);
		list.add(25);
		System.out.println(list);
		Collections.sort(list);// if element is array type we can sort element through collection.sort
		System.out.println(list);
	}
}
/*
 * by using collections class sort method we can able to sort the elements of arraylist.
 * While sorting elements needs to be of the same type. Otherwise we get class cast exception.
.no element should be null, otherwise we get null pointer exception. While sorting
 * */
