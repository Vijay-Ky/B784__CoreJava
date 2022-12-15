class M23 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		System.out.println(sb1.equals(sb2));
	}
}
/*
- in stringBuffer class only toString method got overrided to return the content
but not equals method to compare the content. its using object class equals 
method only.
*/