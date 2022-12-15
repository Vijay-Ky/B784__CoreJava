class Test14 < X >
{
	X obj;
}
class M30
{
	public static void main(String[] args)
	{
		Test14 <? super Q> a1 = null;
		a1 = new Test14 <R> ();
		a1 = new Test14 <S> ();	
		a1 = new Test14 <String> ();		
		a1 = new Test14 <Number> ();		
		System.out.println("done");	
	}
}