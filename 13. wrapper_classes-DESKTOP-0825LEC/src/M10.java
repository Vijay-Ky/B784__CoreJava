public class M10
{
	public static void main(String [] args)
	{
		int i = 10;
		String s1 = "20";
		Integer obj1 = new Integer(i);//i value boxing
		Integer obj2 = new Integer(s1);//s1 value boxing
		int m = obj1.intValue();
		int n = obj2.intValue();
		System.out.println("done");
	}
}
