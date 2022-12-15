import java.util.ArrayList;

class M2
{
	public static void main(String[] args) 
	{
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(90);
		list.add("abc");
		list.add(90.9);
		list.add(true);
		System.out.println(list.size());// total no of element
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}
