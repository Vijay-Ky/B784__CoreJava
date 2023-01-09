class T 
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println("before calling setName method");
		System.out.println(t1.getName());
		t1.setName("new name for main thread");
		System.out.println("after calling setName method");
		System.out.println(t1.getName());
	}
}
