import java.util.ArrayList;

public class M4
{
	public static void main(String[] args)
	{
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(90);
		list.add(9.0);
		list.add(190);
		list.add(910);
		list.add("abc");
		System.out.println(list);
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + ",");
		}
		System.out.println();
		System.out.println("----");

		int[] arr = new int[] {10, 20, 30, 40, 50};
		for (int i : arr)
		{
			System.out.print(i + ",");
		}

		System.out.println();
		System.out.println("--------");

		for (Object obj : list)
		{
			System.out.print(obj + ",");
		}
	}
}
