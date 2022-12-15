class Test17 < X >
{
	X obj;
}
class M33
{
	public static void main(String[] args)
	{
		Test17 <Integer> a1 = null;
		a1 = new Test17 <Integer> ();
		a1 = new Test17 <Object> ();
		a1 = new Test17 <String> ();
		a1.obj = 30;			
		System.out.println("done");	
	}
}