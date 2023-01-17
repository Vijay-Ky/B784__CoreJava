import java.util.ArrayList;
class M14 extends ArrayList
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		M14 list1 = new M14();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		//protected method
		list1.removeRange(2, 6);
		System.out.println(list1);
	}
}
