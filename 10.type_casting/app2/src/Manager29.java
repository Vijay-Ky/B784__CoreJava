class Manager29
{
	public static void main(String[] args)
	{
		A a1 = new C();
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof C);
		System.out.println(a1 instanceof D);//false
		//System.out.println(a1 instanceof String);
		//StringBuffer aa = new StringBuffer("abc");
		//System.out.println(aa instanceof Object);
		Object s1 = new String();
		Object s2 = new String();
		System.out.println("----------------------");
	}
}