class Test1 < X extends P>
{
	X obj;
}
class M17
{
	public static void main(String[] args)
	{
		Test1<R> a1 = new Test1<R>();	
		Test1<S> a2 = new Test1<S>();	
		Test1<T> a3 = new Test1<T>();
		System.out.println("done");	
	}
}