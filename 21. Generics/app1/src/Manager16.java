class Test <X>
{
}
class Manager16
{
	public static void main(String[] args) 
	{
		Test<?> t1 = null;
		Test<?> t2 = null;
		Test<?> t3 = null;
		Test<?> t4 = null;
		Test<?> t5 = null;

		t1 = new Test<Integer>();
		t2 = new Test<Object>();
		t3 = new Test<String>();
		t4 = new Test<P>();
		t5 = new Test<Thread>();
	
		System.out.println("done");
	}
}
