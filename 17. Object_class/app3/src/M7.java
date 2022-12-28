class M7 
{
	public static void main(String[] args) 
	{
		Integer i = 10;
		Integer i1 = new Integer(10);

		Character c = 'c';
		Character c1 = new Character('c');

		Boolean b = true;
		Boolean b1 = new Boolean(true);

		System.out.println(i.hashCode());
		System.out.println(i1.hashCode());

		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());

		System.out.println(b.hashCode());
		System.out.println(b1.hashCode());
	}
}
