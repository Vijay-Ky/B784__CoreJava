import java.util.ArrayList;

class M9
{
	public static void main(String[] args) 
	{
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(90);
		list.add("abc");
		list.add(90.9);
		list.add(true);
		System.out.println(list);
		list.set(2, 'a');
		System.out.println(list);
	}
}
