class D
{
	int i, j;

	D(int i, int j)
	{
		this.i = i;
		this.j = j;
	}

	public int hashCode()
	{
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);

		int hash = s1.hashCode();
		hash += s2.hashCode();

		return hash;
	}
}
class M9 
{
	public static void main(String[] args) 
	{
		D d1 = new D(10, 20);
		D d2 = new D(10, 20);
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());

		D d3 = new D(20, 10);
		System.out.println(d3.hashCode());

		D d4 = new D(200, 100);
		System.out.println(d4.hashCode());
	}
}
