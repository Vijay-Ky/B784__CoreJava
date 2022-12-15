public class L {

	public static void main(String[] args) {
		String s1 = "abc xyz";
		String s2 = "abc \\ xyz";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s2.length());
	}
}
/*
 * if i want to print \ then escape it with another backward slash
   like \\
*/