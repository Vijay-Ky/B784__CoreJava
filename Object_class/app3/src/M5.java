class M5 
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer("hello");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
/*
in StringBuffer class hashcode method is not overrided. even though content is
same we getting different number. in StringBuffer and StringBuilder only toString method got overrided and not equal
and hashcode methods.
*/