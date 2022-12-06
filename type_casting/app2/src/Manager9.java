class Manager9
{
	static Object test1()
	{
		D d1 = new D();
		System.out.println("d1:" + d1);
		return d1;
	}
	public static void main(String[] args)
	{
		Object obj = test1();
		System.out.println("obj:" + obj);
		System.out.println("done");
	}
}