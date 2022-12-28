class B
{
	protected void finalize()
	{
		System.out.println("from finalize");

		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i);
		}
	}
}
class M2 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1 = null;

		//System.gc();

		Runtime.getRuntime().gc();

		for(int i = 101; i <= 200; i++)
		{
			System.out.println(i);
		}

		System.out.println("program end");
	}
}
