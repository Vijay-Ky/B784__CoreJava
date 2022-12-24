public class M18
{
	public static void main(String [] args)
	{
		String s1 = "abc";
		String s2 = "true";
		String s3 = "TRUE";//parseBoolean("TRUE")- > ignore the case
		boolean b1 = Boolean.parseBoolean(s1);
		boolean b2 = Boolean.parseBoolean(s2);
		boolean b3 = Boolean.parseBoolean(s3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
