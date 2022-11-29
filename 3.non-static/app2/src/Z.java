class Z
{
	Z()
	{
		super();
		this();
		System.out.println("Z()");
	}
	public static void main(String[] args)	
	{
		System.out.println("-----");
		Z y2 = new Z();
		System.out.println("-----");
	}
}