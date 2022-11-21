class S
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i = 0;
		do
		{
			System.out.println("body:" + i);
			i++;
		}
		while ((i++ == 1) || (i++ == 2));
		System.out.println("main end");
		System.out.println(i);
	}
}
/*
main begin
body: 0
body: 2
main end
5
*/