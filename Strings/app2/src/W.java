public class W {

	public static void main(String[] args) {
		String s1 = "abc";
		
		System.out.println(s1.substring(0, 0).length());//0
		System.out.println(s1.substring(0, 1).length());//1
		System.out.println(s1.substring(0, 2).length());//2
		System.out.println(s1.substring(1, 1).length());//0
		System.out.println(s1.substring(2, 2).length());//0
	}
}
