class R
{
	enum En
	{
		C1, C2, C3, C4;
	}
}
class S
{
	public static void main(String[] args)
	{
		//En should be refered through R
		//its like inner class
		R.En e1 = R.En.C4;
		R.En e2 = R.En.C2;
		System.out.println(e1);
		System.out.println(e2);
	}
}
//if enum is a member of another class, then you should use
  //enum name along with the class name.
