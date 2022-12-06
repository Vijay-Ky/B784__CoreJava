class A
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class C
{
	A obj;
	void test2()
	{
		System.out.println("C-test2");
		System.out.println(i);
		test1();
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.test2();
	}
}
