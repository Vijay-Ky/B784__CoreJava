class A
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class E
{
	A obj = new A();
	void test2()
	{
		System.out.println("E-test2");
		System.out.println(obj.i);
		obj.test1();
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		e1.test2();
	}
}
