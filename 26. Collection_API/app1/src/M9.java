import java.util.ArrayList;
class M9
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add("abc");
		list1.add('a');
		list1.add(true);
		System.out.println(list1);
		list1.remove("abc");
		System.out.println(list1);
	}
}
