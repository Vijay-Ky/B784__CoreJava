class Test16 < X >
{
	X obj;
}
class M32
{
	public static void main(String[] args)
	{
		Test16 <? super Number> a1 = null;
		a1 = new Test16 <Integer> ();
		a1 = new Test16 <String> ();			
		System.out.println("done");	
	}
}