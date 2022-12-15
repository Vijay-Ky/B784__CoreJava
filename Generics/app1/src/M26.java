class Test10 < X >
{
	X obj;
}
class M26
{
	public static void main(String[] args)
	{
		Test10 <? extends Number> a1 = null;
			a1 = new Test10 <P> ();
			a1 = new Test10 <String> ();	
			a1 = new Test10 <Object> ();	
			System.out.println("done");	
	}
}