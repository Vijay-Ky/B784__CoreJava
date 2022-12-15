class M21 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hell");

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
	}
}
/*
inside String class already equals method got overrided to check the content.
*/