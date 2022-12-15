enum K
{
	t1, t2, t3, t4;
}
class L
{
	public static void main(String[] args)
	{
		K k1 = K.t3;
		System.out.println(k1);
		k1 = K.t4;
		System.out.println(k1);
		//while accessing from the enum that constant should be available in the enum
		k1 = K.t5;
		System.out.println(k1);
	}
}
//by using enum name, we can access only available constant of the same enum.
