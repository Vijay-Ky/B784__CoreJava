public class E {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(20);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("---------------------------");
		sb.append("123456789112345678921");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
/*
 * default capacity is 16 but we can specify the capacity explicitley	
 
 *StringBuffer
public StringBuffer(int capacity)
Constructs a stringbuffer with no characters in it and the specified initial capacity.
Parameters:
capacity - the initial capacity.
Throws:
NegativeArraySizeException - if the capacity argument is less than 0.
 *
 */
