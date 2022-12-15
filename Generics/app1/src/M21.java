class Test5 <X extends Number>
{
	X obj;
}
class M21
{
	public static void main(String[] args)
	{
		Test5 <String> a1 = new Test5 <String>();	
		Test5 <Thread> a2 = new Test5 <Thread>();
		System.out.println("done");	
	}
}