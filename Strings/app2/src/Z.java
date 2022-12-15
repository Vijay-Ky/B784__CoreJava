package app2;

public class Z {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
/* totally 3 string objects are created
 * whatever we supply within the double quote is the constant
   first constant object is created.
* "hello" is a constant. initially one constant object is created.
   then taking that constant reference supplying to the string class
   constructor and by new operator creating a second object.
* while executing another statement, already constant is available "hello"
  is the constant that is available for the entire execution.
  that constant reference will be taking supplying that to the constructor of
  string class constructor and new operator creating a third object.
* Now constant doesnt have a reference, if the constant is not used for
  some time then that constant will be eligible for garbage collection and
  removing from the memory.
*/
