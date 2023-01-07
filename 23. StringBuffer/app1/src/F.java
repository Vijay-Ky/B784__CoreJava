class F
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());//0
		System.out.println(sb.capacity());//default capacity is 16
		System.out.println("----------------------");
		sb.append("12345678911234567");
		System.out.println(sb.length());
		//(oldcapcity * 2) + 2
		System.out.println(sb.capacity());//(16*2)= 32 + 2= 34
	}
}
