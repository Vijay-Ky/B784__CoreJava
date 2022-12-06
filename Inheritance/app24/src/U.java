class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class U extends A
{
	U(int i)
	{
		super(i);
		System.out.println("U(int)");
	}
	public static void main(String[] args) 
	{
		U u1 = new U(90);
		System.out.println("done");
	}
}
