import java.util.ArrayList;
import java.util.Collections;
public class Manager20 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("aBC");
		list.add("ABC");
		list.add("abc");
		list.add("ABc");
		list.add("123");
		list.add("90.6");
		System.out.println(list);
		Collections.sort(list);//all are same type obj
		System.out.println(list);
	}
}
/*
 * string class also implemented comparable interface.
. sorting order in case of string are first numeric value, upper case, then lower case. While sorting it is considering ascii code values.
*/
