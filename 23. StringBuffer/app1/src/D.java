class D 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());//default capacity is 16

		//String s1 = "hello";
		//System.out.println(s1.capacity());
	}
}
