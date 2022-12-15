import java.util.ArrayList;

class M6
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList();
		list1.add(9);
		list1.add(0);
		list1.add(90);
		list1.add(19);
		ArrayList list2 = new ArrayList();
		list2.add(100);
		list2.add(50);
		list2.add("abc");
		list2.addAll(1, list1);
		System.out.println(list1);
		System.out.println(list2);
	}
}
