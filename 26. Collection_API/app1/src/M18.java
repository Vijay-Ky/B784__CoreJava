import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class M18
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(10);
		list.add(5);
		list.add(2);
		list.add(20);
		list.add(28);
		System.out.println(list);
		Comparator ctr = Collections.reverseOrder();
		Collections.sort(list, ctr);
		System.out.println(list);
	}
}
