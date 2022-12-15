public class D {

	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1.equals(s2));
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3.equals(s4));
	}
}
/*
* equals method is the method of object class and it got overrided in the String class.
* equals method is overrided in such a manner that
  it will compare the contents of the objects instead of memory location.
* in every wrapper classes also .equals method got overrided it evaluates two objects based on the content not memory location.
*   
*/