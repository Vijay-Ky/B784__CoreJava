public class A {

	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println(s1);
		
		String s2 = new String("hello");
		System.out.println(s2);
	}
}
/* 
 * String is one of the built in class.
 * String class is available in java.lang package.
 * members of java.lang package can be used straight away without importing.
   all the wrapper classes are available in java.lang package.
 * String s1 = "hello"; we can create a string object without a new operator.
 * String s2 = new String("hello"); we can also use this approach to create String object.
 * while printing s1 we are getting content of the string object. whichever referred by s1.
 * while printing s2 we are getting content of the string object. whichever referred by s2.
 * Inside String class toString method of object class got overrided that is why we get the
   content of the String object while printing the reference of the string object. 
 * In every Wrapper class object also toString method of object class got overrided so whenever we tried
   to print the reference of Wrapper class object we get the content of the object.
 * 
 */