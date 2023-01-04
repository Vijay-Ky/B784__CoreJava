interface M <X>
{
	void test1(X x1);
	X test2(X x1);
}
class N <Y> implements M <Y>
{
	Y x1;
	public void test1(String y1)
	{
	}

	public String test2(String y1)
	{
		return y1;
	}
}
class Manager11 
{
	public static void main(String[] args) 
	{
		N<String> n1 = new N<String>();
		n1.test1("abc");
		String s1 = n1.test2("xyz");
		n1.x1 = "abc";

		N <Integer> n2 = new N <Integer> ();
		n2.test1(20);
		int i = n2.test2(40);

		System.out.println("done");
	}
}
