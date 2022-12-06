class Manager21
{
	static C test()
	{
		A a1 = new D();
		return (C)a1;
	}
	public static void main(String[] args)
	{
		D d1 = (D)test();
		System.out.println("done");
	}
}