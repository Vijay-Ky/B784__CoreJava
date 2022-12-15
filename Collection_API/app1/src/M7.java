import java.util.ArrayList;

class M7
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(0);
		list1.add(9);
		list1.add(4);
		System.out.println(list1);
		ArrayList list2 = new ArrayList(list1);//value pass through constructor 
		list2.add("abc");
		System.out.println(list2);
	}
}
