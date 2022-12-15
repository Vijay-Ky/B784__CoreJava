import java.util.HashSet;

class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "(i = " + i + ")";
	}
}
public class M1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add(new A(90));
		set.add(new A(90));
		set.add(new A(90));
		set.add(new A(900));
		set.add(new A(10));
		//unable to find out the duplicates
		System.out.println(set);
		
		/*
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		System.out.println(set);*/

	}
}
