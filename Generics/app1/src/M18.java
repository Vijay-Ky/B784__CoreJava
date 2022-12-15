class Test2 < X extends R>
{
	X obj;
}
class M18
{
	public static void main(String[] args)
	{
		Test2 <P> a1 = new Test2 <P>();	
		Test2 <Q> a2 = new Test2 <Q>();
		System.out.println("done");	
	}
}