class H
{
	int i;
	int j;

	public String toString()
	{
		return "i: " + i + " j: " + j;
	}
}
class M6
{
	public static void main(String[] args)
	{
		H h1 = new H();

		h1.i = 10;
		h1.j = 20;

		System.out.println(h1);
	}
}