import java.util.LinkedList;

public class M3
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
		//Wherever Queue is possible Stack is also possible.
		System.out.println(list.removeLast());
		System.out.println(list);
		System.out.println(list.removeLast());
		System.out.println(list);
	}
}
/*
1.Wherever Queue is possible Stack is also possible.
*/