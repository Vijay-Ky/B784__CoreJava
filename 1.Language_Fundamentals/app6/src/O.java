class O
{
	public static void main(String[] args)
	{
		int i,j;
		for(i = 0, j = 20;
		(i < 15 && j > 15);
			i++, j--)
		{
			System.out.println(i + "," + j);
		}
		System.out.println(i + "," + j);
	}
}
/*
i = 0,1,2,3,4,5
j =  20,19,18,17,16,15
*/