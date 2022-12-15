import java.util.HashSet;

class D
{
	int i;
	D(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "(" + i + ")";
	}
}

class M10 
{
	public static void main(String[] args) 
	{
		D d1 = new D(90);
		D d2 = new D(910);
		D d3 = new D(90);
		D d4 = new D(9);
		D d5 = new D(10);
		HashSet set = new HashSet();
		set.add(d1);
		set.add(d2);
		set.add(d3);
		set.add(d4);
		set.add(d5);
		System.out.println(set);
	}
}
