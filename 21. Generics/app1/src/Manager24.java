class Test < X >
{
}
class Manager24
{
	public static void main(String[] args) 
	{
		Test <?> a1 = null;

		a1 = new Test<Integer>();
		a1 = new Test<Object>();
		a1 = new Test<String>();

		System.out.println("done");
	}
}
