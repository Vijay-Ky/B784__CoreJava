package pack1;
class O
{
	private O()
	{
		System.out.println("O()");
	}
}
class P
{
	public static void main(String[]args)
	{
		O o1 = new O();
		System.out.println("done");
	}
}
