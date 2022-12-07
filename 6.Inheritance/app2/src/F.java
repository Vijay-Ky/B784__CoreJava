//has-a
class A
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class F
{
	A obj;//has-a bridge
	F(A ref)//ref = a1
	{
		this.obj = ref;//obj = ref
	}
	void test2()
	{
		System.out.println("F-test2");
		System.out.println(obj.i);
		obj.test1();
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		F f1 = new F(a1);
		f1.test2();

		F f2 = new F(new A());
		f2.test2();
	}
}
