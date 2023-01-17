import java.util.ArrayList;
class M12
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(list1);
		ArrayList list2 = new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(5);
		list2.add(6);
		System.out.println(list2);
		System.out.println("---------");
		list1.removeAll(list2);
		System.out.println("list1: " + list1);
	}
}
