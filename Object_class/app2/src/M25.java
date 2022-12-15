import java.util.ArrayList;
class M25 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(90);
		list1.add(910);
		list1.add(190);


		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(90);
		list2.add(910);
		list2.add(190);

		System.out.println(list1.equals(list2));
	}
}
/*
- in all the collection API classes equals method got
overrided to check the contents of the objects.
*/