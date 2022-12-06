class H
{ 
	final int i;
	H()
	{
		i = 10;
		//i = 20;
	}
	H(double j)
	{
		i = 20;	
		//i = 40;
	}
	public static void main(String[] args)
	{
		H h1 = new H();
		H h3 = new H();
		H h2 = new H(90.90);
		System.out.println(h1.i);
		System.out.println(h2.i);
		System.out.println(h3.i);
	}
}