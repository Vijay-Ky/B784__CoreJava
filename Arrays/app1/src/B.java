public class B
{
	public static void main(String[] args)
	{
		int[] x = new int[3];
		//default values
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		//recently assigned values
		System.out.println(x.length);
		System.out.println(x[0]);//10
		System.out.println(x[1]);//20
		System.out.println(x[2]);//30
	}
}