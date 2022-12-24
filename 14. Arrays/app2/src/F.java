public class F {

	public static void main(String[] args) {
		int[] x = new int[10];
		byte[] y = new byte[10];
		x = y;//byte[] cannot be converted to int[]
		// these are objects not variables widening not possible in case of array objects
		y = x;//int[] cannot be converted to byte[]
		System.out.println("done");
	}
}
