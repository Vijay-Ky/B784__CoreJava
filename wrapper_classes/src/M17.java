public class M17
{
	public static void main(String [] args)
	{
		String s1 = "9.8";
		//float f1 = Float.parseFloat(s1);
		//double d1 = Double.parseDouble(s1);
		System.out.println("------");
		//System.out.println(f1);
		//System.out.println(d1);
		System.out.println("------");
		//we can convert the value 9.8 to float or double-
		//-but not to byte,short,int,long
		int i = Integer.parseInt(s1);//NumberFormatException
		//byte i = Byte.parseByte(s1);//NumberFormatException
		//short i = Short.parseShort(s1);//NumberFormatException
		//long i = Long.parseLong(s1);//NumberFormatException
		//System.out.println(i);
		System.out.println("done");
	}
}
