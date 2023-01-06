class H 
{
	public static void main(String[] args) 
	{
		String s1 = "Hi \"\"\"Hello\",@#$%(*&^%";
		String s2 = "\"hello\"";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s2.length());
	}
}
