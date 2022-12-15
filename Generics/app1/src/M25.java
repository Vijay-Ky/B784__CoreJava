class Test7 < X >
{
	X obj;
}
class M25
{
	static void test(Test7 <?> a1)
	{
	}
		public static void main(String[] args)
		{
			Test7 <? extends Number> a1 = null;
			a1 = new Test7 <Number> ();
			a1 = new Test7 <Integer> ();	
			a1 = new Test7 <Byte> ();		
			//a1 = new Test7 <String> ();		
			System.out.println("done");	
		}
	}