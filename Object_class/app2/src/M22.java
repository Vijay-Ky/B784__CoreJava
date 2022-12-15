class M22 
{
	public static void main(String[] args) 
	{
		Integer obj1 = new Integer(90);
		Integer obj2 = new Integer(90);
		Integer obj3 = 90;

		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj2.equals(obj3));
	}
}
/*
in all the 8 wrapper classes equals method got overrided to compare content.
*/