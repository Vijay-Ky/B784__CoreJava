class Test3 < X extends R>
{
	X obj;
}
class M19
{
	public static void main(String[] args)
	{
		Test3 <Integer> a1 = new Test3 <Integer>();
		Test3 <String> a2 = new Test3 <String>();
		System.out.println("done");	
	}
}