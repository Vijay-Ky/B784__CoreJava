class G 
{
	public static void main(String[] args) 
	{
		String s1 = args[0];
		String s2 = args[1];

		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);

		int min = i;
		if(j < i)
		{
			min = j;
		}
		System.out.println("minimum of " + i + " and " + j + " is " + min);
	}
}