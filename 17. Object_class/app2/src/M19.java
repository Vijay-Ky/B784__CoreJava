class M19
{
	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer("hello");

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.equals(s2));
	}
}