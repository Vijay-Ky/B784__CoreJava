public class C
{
	public static void main(String []args)
	{
		int[] x;
		x = new int[3];
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		x = null;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
	}
}
