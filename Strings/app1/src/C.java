public class C {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);
	}
}
/*
 * in case of new operator always it generates a new object.
   even content is same.
 * == operator not checking the content of two objects instead it checking
   whether both reference are pointing to the same object or different object.
 *
 */
