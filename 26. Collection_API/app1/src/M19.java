import java.util.ArrayList;
import java.util.Collections;
class A
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
}
class M19 
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
	}
}
