class Test18 < X >
{
	X obj;
}
class M34
{
	public static void main(String[] args)
	{
		Test18 < ? > a1 = null;
		a1 = new Test18 <Integer> ();
		a1 = new Test18 <String> ();
		a1.obj = 10;			
		System.out.println("done");	
	}
}