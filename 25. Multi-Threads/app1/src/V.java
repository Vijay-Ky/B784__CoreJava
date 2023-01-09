class V
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getPriority());

		t1.setPriority(10);
		System.out.println(t1.getPriority());
	}
}
