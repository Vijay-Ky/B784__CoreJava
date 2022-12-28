import java.util.ArrayList;
class M22
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(10);
		list1.add(10);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(10);
		list2.add(10);

		System.out.println(list1);
		System.out.println(list2);

		System.out.println(list1.equals(list2));
	}
}