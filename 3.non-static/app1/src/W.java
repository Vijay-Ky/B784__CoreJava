class W
{
	int i;
	static W test(W w1)
	{
		W w2 = new W();
		w2.i = w1.i;
		return w2;
	}
	public static void main(String[]args)
	{
		W obj = new W();
		obj.i = 20;
		W rv = test(obj); 
		System.out.println(rv.i);
	}
}