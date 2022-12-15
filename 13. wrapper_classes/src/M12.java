public class M12
{
	public static void main(String [] args)
	{
		boolean MyBool1 = false;
		String s1 = "true";//object creation
		String s2 = "abc"; 
		String s3 = "TRUE"; 
		Boolean b1 = new Boolean(MyBool1);
		Boolean b2 = new Boolean(s1);
		Boolean b3 = new Boolean(s2);
		Boolean b4 = new Boolean(s3);
		//if the value other than true, it will be considered as false

		boolean MyBool2 = b1.booleanValue();
		boolean MyBool3 = b2.booleanValue();
		boolean MyBool4 = b3.booleanValue();
		boolean MyBool5 = b4.booleanValue();

		System.out.println(MyBool2);
		System.out.println(MyBool3);
		System.out.println(MyBool4);
		System.out.println(MyBool5);
	}
}
