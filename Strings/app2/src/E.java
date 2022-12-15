public class E {

	public static void main(String[] args) {
		String s1 = " abc xyz ";
		System.out.println(s1.length());
		System.out.println(s1.trim().length());//still s1 is pointed to the old object only 
		System.out.println(s1.length());
	}
}
