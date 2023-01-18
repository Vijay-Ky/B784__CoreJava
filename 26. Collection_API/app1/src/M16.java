import java.util.ArrayList;
import java.util.Collections;
class M16
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
		Collections.sort(list);
		System.out.println(list);
	}
}
