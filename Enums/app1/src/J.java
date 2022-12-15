enum I
{
	//every constant should be a valid java identifier.
	test1, test2, test3;
}
class J
{
	public static void main(String[] args)
	{
		I ref1 = I.test3;
		System.out.println(ref1);
		ref1 = I.test1;
		System.out.println(ref1);	
	}
}
//enum can be used to specify the datatype