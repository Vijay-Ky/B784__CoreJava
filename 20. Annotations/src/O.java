@interface N
{
	int version() default 1;
	String author() default "vijay";
}

@N(author = "abc")
class O
{
	@N
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
