@interface P
{
	int[] versions();
}

@P(versions = {1, 2, 3})
class Q 
{
	@P(versions = {1, 2, 3, 4})
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
