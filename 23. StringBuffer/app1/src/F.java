class F
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());//default capacity is 16
		System.out.println("----------------------");
		sb.append("121345678911234567");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
