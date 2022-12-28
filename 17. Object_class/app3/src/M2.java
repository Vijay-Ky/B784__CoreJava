class B
{
	int i;
	int j;
	B(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
}
class M2
{
	public static void main(String[] args)
	{
		B b1 = new B(90, 10);
		B b2 = new B(90, 10);
		B b3 = b2;

		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());	
	}
}