//Queue
import java.util.LinkedList;

public class M1
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(990);
		list.add(190);
		list.add(290);
		list.add(80);
		list.add(790);
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.removeFirst());
		System.out.println(list);
	}
}
/*
1. LinkedList is supporting basic queue.
2. Queue FIFO
*/


