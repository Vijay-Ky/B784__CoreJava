public class F {
	public static void main(String[] args) {
		//adding 4 characters
		StringBuffer sb = new StringBuffer("test");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("---------------------------");
		sb.append("12345678911234567");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("---------------------------");
		//removes extra capacity 
		//length and capacity becomes same
		//unoccupied locations will be removed and length and capacity bcms same 
		sb.trimToSize();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
/*
 * StringBuffer
public StringBuffer(String str)
Constructs a string buffer initialized to the contents of the specified string. The initial capacity of the string buffer is 16 plus the length of the string argument.
Parameters:
str - the initial contents of the buffer.
Throws:
NullPointerException - if str is null
*/
