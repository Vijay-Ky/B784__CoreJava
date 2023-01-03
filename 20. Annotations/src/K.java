@interface J
{
	int version();
	String author();
}

@J(version = 2, author = "abc")
class K
{
	@J(author = "xyz", version = 3)
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
