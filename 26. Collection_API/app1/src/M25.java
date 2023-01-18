import java.util.LinkedList;
class M25
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println(list.removeLast());
		System.out.println(list);
	}
}
