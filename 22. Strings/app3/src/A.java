public class A {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
/*
 * only two objects create here.
 * whatever we supply within the double quote is the constant
   first constant object is created.
 *"hello" is a constant. initially one constant object is created.
   then taking that constant reference supplying to the string class
   constructor and by new operator creating a second object.
 * String s2 = "hello"; we are assigning constant only i,e "hello"
   already constant "hello" is available reference of that constant is straight away
   assigning to s2
   
 */