public class V {

	public static void main(String[] args) {
		//String s1 = null;
		String s1 = "abc" + null;
		System.out.println(s1.length());	
	}
}
/* we dont ge 4 as the length
 * considering s1 content as null.
 * we are not adding null to the s1
 * when we call any property or method from the null reference we get NullPointerException
**/