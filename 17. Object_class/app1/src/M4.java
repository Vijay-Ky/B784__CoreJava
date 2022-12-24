class F
{
	int i;

	public String toString()
	{
		return "This is a type of Object with i value as: " + i;
	}
}
class M4
{
	public static void main(String[] args)
	{
		F f1 = new F();
		f1.i = 10;
		
		System.out.println(f1);
	}
}