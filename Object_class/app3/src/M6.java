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
in StringBuffer
and StringBuilder only toString method got overrided and not
equal and hashcode methods
*/