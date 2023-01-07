class H
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("test");//default capacity = 16 + content = 20
		System.out.println(sb.length());//4
		System.out.println(sb.capacity());//20
		System.out.println("----------------------");
		sb.append("123456789112345678921");
		sb.append("abc");
		System.out.println(sb.length());
		//(oldcapcity * 2) + 2
		System.out.println(sb.capacity());//
		System.out.println(sb);//

	}
}
