public class M15
{
	public static void main(String [] args)
	{
		int i = 10;
		//converting primitive type to string type
		String s1 = Integer.toString(i);
		System.out.println(s1);
		double j = 34.09;
		String s2 = Double.toString(j);
		System.out.println(s2);
		boolean b1 = true;
		String s3 = Boolean.toString(b1);	
		System.out.println(s3);
		char c1 ='f';
		String s4 = Character.toString(c1);
		System.out.println(s4);
		System.out.println("done");
	}
}
/*1.In all the wrapper classes there is a static toString method that is taking-
  -corresponding primitive as the argument.
  2.In all the wrapper classes there are two toString methods got overloaded-
  -One is non static, no arg, object class toString method.
  -Second one is a static, arg toString method.
  3.Char can be converted into string but String cant be converted to char


java.lang.Integer.toString()
java.lang.Integer.toString(int a)
 parameter - refering to the integer that is needed to be converted to string
 returns - returns the String object representing the specified integer
           int a is the integer to be converted.
*/