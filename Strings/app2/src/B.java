public class B {

	public static void main(String[] args) {
		String s1 = " abc xyz ";
		System.out.println(s1.length());
		s1 = s1.trim();
		System.out.println(s1.length());
	}
}
/*
 * trim method removes the leading and trailing white spaces but not the in between white space.
 * while removing the 2 white spaces string object modified so a new object will be generated.
 * still s1 pointing the old string only so we get 9 
*/