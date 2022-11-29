package rst;
class I extends H
{
	public static void main(String[]args)
	{
		I i1 = new I();
		System.out.println(i1.j);
		System.out.println(i1.k);

		H h1 = new H();
		//System.out.println(h1.j);
		System.out.println(h1.k);
	}
}