public class A
{
	public static void main(String []args)
	{
		//normal approach for storing huge number of elements
		int i = 0;
		int j = 20;
		int k = 30;
		int l = 40;
		System.out.println(i);

		//array approach to store huge number of elements 
		int[] ref = new int[1000];
		ref[0] = 1;
		ref[1] = 2;
		ref[2] = 3;
		ref[3] = 4;
		ref[4] = 5;
		ref[5] = 6;
		
		ref[999] = 1000; 

		System.out.println(ref[1000]);

	}
}