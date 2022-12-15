class Test4 < X extends Number>
{
	X obj;
}
class M20
{
	public static void main(String[] args)
	{
		Test4 <Number> a1 = new Test4 <Number> ();
		Test4 <Byte> a2 = new Test4 <Byte> ();
		Test4 <Short> a3 = new Test4 <Short> ();
		Test4 <Integer> a4 = new Test4 <Integer> ();
		Test4 <Long> a5 = new Test4 <Long> ();
		Test4 <Float> a6 = new Test4 <Float> ();
		Test4 <Double> a7 = new Test4 <Double> ();
		System.out.println("done");
	}
}