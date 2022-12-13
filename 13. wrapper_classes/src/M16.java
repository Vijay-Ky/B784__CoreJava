public class M16
{
	public static void main(String [] args)
	{
		String s1 = "45";
		//string can be converted to any primitive except char
		byte b1 = Byte.parseByte(s1);
		int i = Integer.parseInt(s1);
		double d1 = Double.parseDouble(s1);
		long d2 = Long.parseLong(s1);
		boolean b2 = Boolean.parseBoolean(s1);

		System.out.println(b1);
		System.out.println(i);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(b2);	
	}
}
/* public static int parseInt(String s) throws NumberFormatException

   - This function parses the string argument as a signed integer.


static boolean	parseBoolean(String s)
   Parses the string argument as a boolean.
*/