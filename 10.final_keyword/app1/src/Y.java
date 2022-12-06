class Y
{ 
	final int i;
	Y()
	{
		this.i = 10;
	}
	Y(final int i)
	{
		//i = 89;
		this.i = 20;
		//this.i = 40;
	}

	public static void main(String[] args)
	{
		Y y1 = new Y(); 
		Y y2 = new Y(10);
		System.out.println(y1.i);
		System.out.println(y2.i);
	}
}