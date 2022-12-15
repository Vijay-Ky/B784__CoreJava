import java.util.ArrayList;
class M8 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		Integer obj = 10;
		Thread t1 = new Thread();
		ArrayList list = new ArrayList();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(t1);
		System.out.println(list);
	}
}
/*
1. In all these classes toString method of object class got overrided to return the content instead of the memory address.
*/
