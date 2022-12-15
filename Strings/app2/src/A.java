public class A {

	public static void main(String[] args) {
		String s1 = "xyz";
		System.out.println(s1);
		s1 = s1.concat("hello");
		System.out.println(s1);
	}
}
/* s1 = s1.concat("hello"); after this statement xyz object not modified but instead s1 is reassigned to a new different object that contains xyzhello as the content
 * old object with the content xyz becomes abadoned bcz of no reference.
*/