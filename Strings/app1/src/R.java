public class R {

	public static void main(String[] args) {
		String s1 = null;//String s1 =  null + null;
		String s2 = s1 + null;// in this case one of the operand is of string type
		String s3 = null + s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
/* null value can be supplyed to any derived datatype
*/