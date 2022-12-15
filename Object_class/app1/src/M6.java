class B
{
	int i, j;
	B(int k, int l)
	{
		this.i = k;
		this.j = l;
	}
	public String toString()
	{
		return i + ":" + j;
	}
}
class M6
{
	public static void main(String[] args) 
	{
		B b1 = new B(10, 20);
		System.out.println(b1);
	}
}
