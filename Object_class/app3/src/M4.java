class M4 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
	}
}
/*
inside String
class hashcode is already overrided, based on the content it is
returning int value.
*/
