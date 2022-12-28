class A
{
	//protected void finalize()
	public void finalize()
	{
		System.out.println("FROM FINALIZE");
	}
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1 = null;

		System.out.println("Program end");
	}
}
