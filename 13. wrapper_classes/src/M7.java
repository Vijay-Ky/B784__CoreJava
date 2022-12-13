public class M7
{
	public static void main(String [] args)
	{
		String s1 = "10Z";
		//compiler doesnt bother about the content of s1
		//compilation sucess
		Byte b1 = new Byte(s1);
		byte b2 = b1.byteValue();
		System.out.println("done");
	}
}
