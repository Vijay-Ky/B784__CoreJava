class Test13 < X >
{
	X obj;
}
class M29
{
	public static void main(String[] args)
	{
		Test13 <? super Q> a1 = null;
		a1 = new Test13 <Q> ();
		a1 = new Test13 <P> ();	
		a1 = new Test13 <Object> ();		
		System.out.println("done");	
	}
}