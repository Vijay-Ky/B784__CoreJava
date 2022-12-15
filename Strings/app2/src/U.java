public class U {

	public static void main(String[] args) {

		String s1 = "java technologies";
		//			 0123456789
		String s2 = s1.substring(5, 17);//Returns a string that is a substring of this string
		String s3 = s1.substring(0, 4);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
/* substring method(index inclusive, index exclusive)
*/