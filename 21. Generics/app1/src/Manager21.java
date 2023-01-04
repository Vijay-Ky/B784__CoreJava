class Test < X >
{
}
class Manager21
{
	public static void main(String[] args) 
	{
		Test <? super Number> a1 = null;

		a1 = new Test<Number>();
		a1 = new Test<String>();

		System.out.println("done");
	}
}
