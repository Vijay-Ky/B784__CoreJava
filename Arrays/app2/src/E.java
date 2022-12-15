public class E {

	public static void main(String[] args) {
		int[] x = new int[10];
		int[] y = new int[20];
		x = y;
		System.out.println(x.length);
		y = x;
		System.out.println(x[19]);
		System.out.println(x.length);
		System.out.println(y.length);
		System.out.println("done");
	}
}
