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

	public int hashCode()
	{
		return i;
	}

	public boolean equals(Object obj)
	{
		return i == ((A)obj).i;
	}
}
class M32
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(new A(10));
		set.add(new A(10));
		set.add(new A(20));
		set.add(new A(20));
		set.add(new A(30));
		set.add(new A(40));
		System.out.println(set);
	}
}
