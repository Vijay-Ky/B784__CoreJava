public class I {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hellotoall");
		System.out.println(sb);          // 0123456789
		sb.delete(2, 6);
		System.out.println(sb);
	}
}
