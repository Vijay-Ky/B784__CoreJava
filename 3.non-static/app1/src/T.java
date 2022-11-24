class T
{
	int i;
	static T test()
	{
		T t1 = new T();
		return t1;
	}
	public static void main(String[] args)
	{
		T obj = test();
		System.out.println(obj.i);
	}
}