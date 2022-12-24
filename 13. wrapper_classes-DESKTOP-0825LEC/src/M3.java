public class M3
{
	public static void main(String [] args)
	{
		char c1 = 'a';
		Character c2 = new Character(c1);//boxing
		char c3 = c2.charValue();//unboxing
		System.out.println("done");
	}
}