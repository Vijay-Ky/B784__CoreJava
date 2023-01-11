class A extends Thread
{
	A(String name)
	{
		super(name);
	}

	@Override
	public void run()
	{
		System.out.println("from run");
		System.out.println(10/0);
	}
}
class B 
{
	public static void main(String[] args) 
	{
		A a1 = new A("thread 101");
		a1.start();
		System.out.println(a1.getName());
	}
}
