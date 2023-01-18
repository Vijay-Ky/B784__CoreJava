import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class A 
{
	int i, j;
	A(int i, int j)
	{
		this.i = i;
		this.j = j;
	}

	public String toString()
	{
		return "(i = " + i + ", " + j + ")";
	}
}
class SortBasedOnIValue implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		A a1 = (A)o1;
		A a2 = (A)o2;
		return a1.i - a2.i;
	}
}
class SortBasedOnJValue implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		A a1 = (A)o1;
		A a2 = (A)o2;
		return a1.j - a2.j;
	}
}
class M21 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new A(10, 1));
		list.add(new A(100, 10));
		list.add(new A(20, 5));
		list.add(new A(30, 6));
		list.add(new A(18, 2));
		list.add(new A(5, 8));
		System.out.println(list);
		Collections.sort(list, new SortBasedOnIValue());
		System.out.println(list);
		Collections.sort(list, new SortBasedOnJValue());
		System.out.println(list);
	}
}
