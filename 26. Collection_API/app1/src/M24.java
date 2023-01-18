import java.util.LinkedList;
class M24 
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.removeFirst());
		System.out.println(list);
	}
}
