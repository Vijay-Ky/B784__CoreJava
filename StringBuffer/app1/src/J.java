public class J {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hellotoall");
		System.out.println(sb);          // 0123456789
		sb.delete(2, 9000);
		System.out.println(sb);
		System.out.println(sb.length());
		String s = new String("hello");
		String s2 = s.substring(0, 2);
		System.out.println(s2);
		
	}
}
/*
 * no exception while going beyond.
 * in case of delete second argument any int number beyond the length
 * */
