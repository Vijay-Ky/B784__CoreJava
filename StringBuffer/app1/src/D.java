public class D {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("---------------------------");
		sb.append("12345678911234567");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
/*
 * capacity will be automatically increased
 * bcz of this StringBuffer is mutable.

 new capcity = old capacity * 2 + 2
 */
