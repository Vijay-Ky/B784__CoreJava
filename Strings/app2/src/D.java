public class D {

	public static void main(String[] args) {
		String s1 = " abc xyz ";
		System.out.println(s1.length());
		s1 = s1.trim();
		System.out.println(s1.length());
	}
}
/* old string will be abandoned
 * s1 is reassigned to a new trimmed string object
 */
