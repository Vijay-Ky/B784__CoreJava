class Test9 < X >
{
	X obj;
}
class M23
{
	public static void main(String[] args)
	{
		//?wild card character, can only be applied to reference variable
		Test9 <?> a1 = null;	
		a1 = new Test9 <Integer> ();
		a1 = new Test9 <Object> ();
		a1 = new Test9 <P> ();
		a1 = new Test9 <String> ();
		a1 = new Test9 <Thread> ();
		System.out.println("done");	
	}
}