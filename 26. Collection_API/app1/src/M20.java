import java.util.ArrayList;
import java.util.Collections;
class A implements Comparable
{
	int i;
	A(int i)
	{
		this.i = i;
	}

	public String toString()
	{
		return "i = " + i;
	}

	public int compareTo(Object obj)
	{
		int result = i - ((A)obj).i;
		System.out.println("comparing " + this.i + "and" +
			"argument object i: " + obj + " and the result: " + result);
		return result;
	}
}
class M20 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new A(10));
		list.add(new A(100));
		list.add(new A(20));
		list.add(new A(30));
		list.add(new A(18));
		list.add(new A(5));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
