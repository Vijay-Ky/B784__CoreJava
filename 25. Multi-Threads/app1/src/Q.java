class Q 
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
	}
}
