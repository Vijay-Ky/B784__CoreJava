class M
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("hellotoallofyou");
		                                 // 012345678911234
		System.out.println(sb);
		sb.delete(2, 600);
		System.out.println(sb);
	}
}
