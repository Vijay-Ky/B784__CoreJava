class J 
{
	public static void main(String[] args) 
	{
		String s1 = "some content";

		char[] ch = s1.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--)
		{
			System.out.print(ch[i]);
		}
	}
}
