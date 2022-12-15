public class M9
{
	public static void main(String [] args)
	{
		String s1 = "a";
		Character c1 = new Character(s1);
		//there is no way we can convert from string to char
		//even if it is contains a single char
		//no method support to convert string into char
		//inside a Character there is no constructor takes string as argment
		char c2 = c1.charValue();
		System.out.println("done");
	}
}
