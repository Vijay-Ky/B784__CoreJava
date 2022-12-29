class F 
{
	public static void main(String[] args) throws Exception
	{
		//while loading the Enum E and constants
		//for each constant constructor will execute once
		Class c1 = Class.forName("E");

		Object[] c2 = c1.getEnumConstants();

		int count = 0;

		for(Object c3 : c2)
		{
			count++;
			System.out.println(c3);
		}
		System.out.println("Number of Constants Available:" + count);
	}
}
