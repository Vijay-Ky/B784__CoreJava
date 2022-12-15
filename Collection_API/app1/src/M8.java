import java.util.ArrayList;

class M8
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(4);
		list.add(6);//remove element---list.remove
		list.add(8);
		list.add(2);
		list.add(1);
		list.add(3);
		System.out.println(list);
		int obj = (Integer)list.remove(3);
		System.out.println(list);
		System.out.println(obj);//whatever element is remove same assign into obj..
		//obj = (Integer)list.remove(10);//element is not available at 10 index-------indexOutOfBound Exception
		//System.out.println(obj);	
	}
}
