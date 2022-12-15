//List features as well as Queue features 
import java.util.LinkedList;

public class M7
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(990);
		list.add(190);
		list.add(290);
		list.add(790);
		System.out.println(list);
		//pollLast reads and removes the last element.
		System.out.println(list.pollLast());
		System.out.println(list);
		System.out.println(list.pollLast());
		System.out.println(list);
	}
}