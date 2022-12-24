import java.util.Arrays;

public class Z {
	public static void main(String[] args) {
		int[] x = new int[2];
		System.out.println(x.length);
		x[0] = 100;
		x[1] = 200;
		System.out.println(Arrays.toString(x));
		test(x);
		System.out.println(Arrays.toString(x));
		test1(x);
		System.out.println(Arrays.toString(x));
	}

	static void test(int[] y) {
		y[0] = 1000;
		y[1] = 2000;
	}
	static void test1(int[] z) {
		z[0] = 3000;
		z[1] = 4000;
	}
}
//arrays are also objects in case of java
//pass by reference changes in the test method reflecting back to the main method
