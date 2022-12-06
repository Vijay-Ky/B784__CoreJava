class Manager4
{
	static void test1(A a1)
	{
		System.out.println("test1(A)");
	}
	static void test2(C obj)
	{
		System.out.println("test2(C)");
		System.out.println("obj:" + obj);
	}
	static D test3()
	{
		D dobj = new D();
		System.out.println("dobj:" + dobj);
		return dobj;//return type is d type
	}
	static B test4()
	{
		return new B();//return type is b type
	}
	public static void main(String[] args)
	{
		test1(new A());
		C c1 = new C();
		test2(c1);
		System.out.println("c1:" + c1);
		D d1 = test3();
		System.out.println("d1:" + d1);
		B b1 = test4();
		System.out.println("done");
	}
}//homogenous