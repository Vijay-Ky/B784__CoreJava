interface M <X>
{
	void test1(X x1);
	X test2(X x1);
}
class N <Y> implements M <Y>
{
	public void test1(Y y1)
	{
			
	}
	public Y test2(Y y1)
	{
		return y1;
	}
}
class Manager10
{
	public static void main(String [] args)
	{
		
		N <String>  n1 = new N <String> ();
		n1.test1("abc");
		String s1 = n1.test2("xyz");
		N <Integer> n2 = new N <Integer> ();
		int i = n2.test2(100);
		System.out.println(s1);
		System.out.println(i);
		System.out.println("done");
	}
}