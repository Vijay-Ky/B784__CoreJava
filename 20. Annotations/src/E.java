@interface D
{
	String someDesc();
}
class E
{
	@D(someDesc="some description about main")
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}