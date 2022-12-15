import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager28 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(23);
		list.add(49);
		list.add(15);
		Collections.sort(list);
		System.out.println(list);
		int i = Collections.binarySearch(list, 49);
		System.out.println("element available at: " + i);
	}
}
