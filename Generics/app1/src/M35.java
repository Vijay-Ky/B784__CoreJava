class Test19 < X >
{
	X obj;
}
class M35
{
	public static void main(String[] args)
	{
		Test19 < ? > a1 = null;
		a1 = new Test19 <P> ();
		a1.obj = new P();			
		System.out.println("done");	
	}
}