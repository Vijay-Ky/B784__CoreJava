class Test20 < X >
{
	void test(X arg)
	{
	}
}
class M36
{
	public static void main(String[] args)
	{
		Test20 < ? > a1 = null;
		a1 = new Test20 <P> ();
		//a1 can point to any object not fixed
		a1.test(new P());			
		System.out.println("done");	
	}
}