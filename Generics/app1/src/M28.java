class Test12 < X >
{
	X obj;
}
class M28
{
	public static void main(String[] args)
	{
		Test12 <? extends Q> a1 = null;
		a1 = new Test12 <P> ();
		a1 = new Test12 <Object> ();	
		a1 = new Test12 <String> ();	
		System.out.println("done");	
	}
}