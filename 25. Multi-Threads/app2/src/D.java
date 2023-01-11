class C implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("from run");
	}
}
class D 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		Thread t1 = new Thread(c1, "new thread 101");
		t1.start();
		System.out.println(t1.getName());
	}
}
