class Test11 < X >
{
	X obj;
}
class M27
{
	public static void main(String[] args)
	{
		Test11 <? extends Q> a1 = null;
		a1 = new Test11<Q>();
		a1 = new Test11<R>();	
		a1 = new Test11<S>();	
		a1 = new Test11<T>();	
		System.out.println("done");	
	}
}