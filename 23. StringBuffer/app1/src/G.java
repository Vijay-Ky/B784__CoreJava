class G
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer(40);
		System.out.println(sb.length());//
		System.out.println(sb.capacity());//
		System.out.println("----------------------");
		sb.append("123456789112345678921");
		sb.append("abc");
		System.out.println(sb.length());
		//(oldcapcity * 2) + 2
		System.out.println(sb.capacity());//
		System.out.println(sb);//

	}
}
