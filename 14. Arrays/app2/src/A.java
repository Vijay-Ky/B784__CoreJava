import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		//2nd way of creating & initializing array obj
		//size must not be supplied
		int[] x = new int[] {10, 20, 30, 40};
		System.out.println(x.length);
		System.out.println(Arrays.toString(x));
	}
}
