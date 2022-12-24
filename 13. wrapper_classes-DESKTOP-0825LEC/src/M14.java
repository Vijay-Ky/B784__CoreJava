public class M14
{
	public static void main(String [] args)
	{
		String s1 = "s";
		char c1 = 'd';
		//In Character Wrpper class there is only one valueOf() method-
		//-that accepts only char type as the argument
		//String cant be converted into char type
		//In Character wrapper class there is no method supports that converts
		//-string into char
		Character c2 = Character.valueOf(s1);
		Character c3 = Character.valueOf(c1);
		System.out.println("done");
	}
}
