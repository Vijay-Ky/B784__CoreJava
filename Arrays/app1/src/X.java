public class X {
	public static void main(String[] args) {
		short b1 = 100; //byte b1 = 100;
		double[] elements = new double[b1];//upcasting
		byte b2 = 50; //short b1 = 100;
		System.out.println(elements[b2]);
	}
}
//byte short int long float double boolean char
//byte < short < int < long  < float < double