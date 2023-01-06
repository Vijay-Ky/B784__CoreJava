class O
{
	public static void main(String[] args) 
	{
		String s1 = "java is very easy and fun and exciting";
		           //01234567891123456789212345678931234567

		//String s2 = s1.substring(8, 16);//(begin(inclusive), end(exclusive)-1)
		String s2 = s1.substring(8, 16+1);
		
		System.out.println(s2);
	}
}
