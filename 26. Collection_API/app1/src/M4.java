import java.util.ArrayList;
class M4
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add('a');
		list.add(true);
		list.add(20.0);
		list.add(20.0);
		System.out.println(list);
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}
