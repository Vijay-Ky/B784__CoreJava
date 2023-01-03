@interface H
{
	int version();
	String author();
}

@H(version = 2, author = "abc")
class I 
{
	@H(version = 3, author = "xyz")
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
