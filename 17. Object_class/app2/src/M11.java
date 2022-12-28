class B
{
	int i;
	double j;

	B(int i, double j)
	{
		this.i = i;
		this.j = j;
	}

	public boolean equals(Object obj)
	{
		return (this.i == ((B)obj).i && this.j == ((B)obj).j);
	}
}
class M11
{
	public static void main(String[] args)
	{
		B b1 = new B(10, 2.5);
		B b2 = new B(10, 2.5);

		B b3 = b2;

		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));

		System.out.println(b1.i == b2.i && b1.j == b2.j);

		System.out.println(b3 == b2);
		System.out.println(b3.equals(b2));

		System.out.println(b3.i == b2.i && b3.j == b2.j);
	}
}