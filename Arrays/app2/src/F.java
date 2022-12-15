public class F {

	public static void main(String[] args) {
		int[] x = new int[10];
		byte[] y = new byte[10];
		x = y;// these are objects not variables widening not possible in case of array objects
		y = x;
		System.out.println("done");
	}
}
