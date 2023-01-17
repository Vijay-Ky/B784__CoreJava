import java.util.ArrayList;
class M1 
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
	}
}
