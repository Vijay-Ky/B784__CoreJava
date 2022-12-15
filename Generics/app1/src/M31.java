class Test15 < X >
{
	X obj;
}
class M31
{
	public static void main(String[] args)
	{
		Test15 <? super Number> a1 = null;
		a1 = new Test15 <Number>();
		a1 = new Test15 <Object>();			
		System.out.println("done");	
	}
}