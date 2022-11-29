interface E
{
	void test1();
}
class F
{
	public void test1()
	{
		System.out.println("from test1");
	}
}
class G extends F implements E
{
	public static void main(String[] args)
	{
		G obj = new G();
		obj.test1();
		System.out.println("done");
	}
}