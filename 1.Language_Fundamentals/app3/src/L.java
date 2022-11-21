class L
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = i++ + i + i-- + i +//0 + 1 + 1 + 0
		i-- + i++ + i-- + i +//0 + -1 + 0 + -1
		i++ + i-- + i + i++;//-1 + 0 + -1 + -1
		System.out.println(i);
		System.out.println(j);
	}
}
//i = 0, 1, 0, -1, 0, -1, 0, -1, 0