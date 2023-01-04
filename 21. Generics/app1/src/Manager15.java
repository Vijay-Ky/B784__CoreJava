class Test <X extends R>
{
}
class Manager15
{
	public static void main(String[] args) 
	{
		Test<String> t1 = new Test<String>();
		Test<Integer> t2 = new Test<Integer>();
	
		System.out.println("done");
	}
}
