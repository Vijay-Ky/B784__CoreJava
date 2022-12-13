public class M33
{
	static Integer test(int i)
	{
		//error in case of JDK <= 1.4 int cannot be converted to Integer
		//success in case of JDK >= 1.5 auto boxing
		//return i.intValue();//CTE int cant be dereferenced
		return i;
	}
	public static void main(String [] args)
	{
		byte b1 = 20;
		Integer obj = test(b1);
		System.out.println("done");
	}
}
