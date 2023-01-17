import java.util.ArrayList;
class M7
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add("abc");
		list1.add('a');
		list1.add(true);
		ArrayList list2 = new ArrayList();
		list2.add(100);
		list2.add(false);
		list2.addAll(2, list1);
		System.out.println(list1);
		System.out.println(list2);
	}
}
