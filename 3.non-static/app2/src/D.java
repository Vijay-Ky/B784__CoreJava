class D
{
	int i;
	int j = 20;
	D(int i)
	{
		System.out.println("D()");
		this.i = 10;
	}
	public static void main(String[] args)
	{
		D d1 = new D(1);
		System.out.println("-----");
		System.out.println(d1.i);
		System.out.println(d1.j);
	}
}