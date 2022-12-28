import java.util.ArrayList;
class M8 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("hello");
		list1.add("hello");
		list1.add("hello");
		list1.add("hello");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("hello");
		list2.add("hello");
		list2.add("hello");
		list2.add("hello");
		//list2.add("hell");

		System.out.println(list1.hashCode());
		System.out.println(list2.hashCode());
	}
}
