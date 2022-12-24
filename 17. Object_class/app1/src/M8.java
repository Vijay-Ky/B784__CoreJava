import java.util.ArrayList;
class M8
{
	public static void main(String[] args)
	{
		String s1 = "abc";
		Integer i = 10;
		Thread t1 = new Thread();
		ArrayList l1 = new ArrayList();

		System.out.println(s1);
		System.out.println(i);
		System.out.println(t1);
		System.out.println(l1);
	}
}
/*
In all these classes toString method of object class got overrided to print the 
content of the object instead of memory address*/