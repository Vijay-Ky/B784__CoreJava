class B
{
	protected void finalize() throws Throwable
	{
		System.out.println("from finalize");
	}
}
class M2 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1 = null;
		System.gc();
		//Runtime.getRuntime().gc();
		System.out.println("end of the program");
	}
}
/*
- there is a way of 
calling garbage collector to scan the heap memory and remove the
abandoned object that is by making a request to the gc
- there are two ways to make the request
System.gc();
//Runtime.getRuntime().gc();
-demon thread is
background thread and user thread is forground thread that serves
customer requirements
-
-
-
-----
*/