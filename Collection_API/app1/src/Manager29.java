import java.util.ArrayList;
import java.util.Collections;

public class Manager29 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(5);
		list.add(4);
		list.add(19);
		list.add(90);
		list.add(29);
		list.add(5);
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
	}
}
