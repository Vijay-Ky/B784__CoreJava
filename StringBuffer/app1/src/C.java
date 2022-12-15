public class C {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
/*
 * the default capacity is 16. after adding 16 characters size will be 
   automatically increasing
*/
