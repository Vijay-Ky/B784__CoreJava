class M1 
{
	public static void main(String[] args) 
	{
		int i = 10 / 0;
		int j = Integer.parseInt("abc");
		String s1 = null;
		int k = s1.length();
		int[] elements = new int[5];
		int m = elements[200];
		Object obj = new Integer(90);
		String str = (String)obj;
		main(null);
		int[] array = new int[99999999];//out-of-memory-error
		System.out.println("Hello World!");
	}
}
/*
1. no statement required try catch all the statements compiles successfully
2. all are produces run time exception.
3. only checked require try catch.
*/