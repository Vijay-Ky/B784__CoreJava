public class M22
{
	public static void main(String [] args)
	{
		//we can assign referece to object straightaway.
		Integer obj1 = new Integer(10);
		//JDK 1.4 or before, assigning literal to reference not allowed.
		//but from JDK 1.5 it is possible.
		//In JDK 1.5 introduced auto-boxing and auto-unboxing-
		//-compiler only converts where required.
		//compiler only coverting 10 into object
		Integer obj2 = 10;//auto-boxing
		System.out.println("done");
		int i = new Integer(10);//auto-unboxing
		System.out.println(i);
	}
}
