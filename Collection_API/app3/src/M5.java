import java.util.LinkedList;

public class M5
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
		//poll reading and removing the head element.
		//through poll method we achieve perfect queue.
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
	}
}