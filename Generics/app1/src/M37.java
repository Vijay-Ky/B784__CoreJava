class Test30 < X >
{
	void test(X arg)
	{
	}
}
class M37
{
	public static void main(String[] args)
	{
		Test30 < ? extends Number > a1 = null;
		a1 = new Test30 <Number> ();
		a1.test(10);			
		System.out.println("done");	
	}
}