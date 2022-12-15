import java.util.ArrayList;
class M8 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("hello1");
		list1.add("hello2");
		list1.add("hello3");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("hello1");
		list2.add("hello2");
		list2.add("hello3");

		System.out.println(list1.hashCode());
		System.out.println(list2.hashCode());
	}
}
