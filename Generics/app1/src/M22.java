class Test8 <X extends Number>
{
	X obj;
}
class M22
{
	public static void main(String[] args)
	{
		Test8 <P> a1 = new Test8 <P> ();	
		Test8 <Q> a2 = new Test8 <Q> ();
		System.out.println("done");	
	}
}