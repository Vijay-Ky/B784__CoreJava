import java.util.LinkedList;

public class M6
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
		//wherever we are achieving queue there we can also achieve stack.
		//peekLast just reads the last element.
		System.out.println(list.peekLast());
		System.out.println(list);
		System.out.println(list.peekLast());
		System.out.println(list);
	}
}