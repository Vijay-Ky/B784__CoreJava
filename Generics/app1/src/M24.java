class Test6 < X >
{
	X obj;
}
class M24
{
	static void test(Test6 <?> a1)
	{
	}
		public static void main(String[] args)
		{
			test(new Test6 <Integer> ());	
			test(new Test6 <Object> ());	
			test(new Test6 <P> ());	
			test(new Test6 <String> ());	
			test(new Test6 <Thread> ());
			System.out.println("done");	
		}
}