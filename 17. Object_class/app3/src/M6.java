class M6
{
	public static void main(String[] args)
	{
		StringBuilder s1 = new StringBuilder("hello");
		StringBuilder s2 = new StringBuilder("hello");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
/*
1. String class - toString(), equals(), hashCode()
2. StringBuffer - toString()
3. StringBuilder - toString()
*/