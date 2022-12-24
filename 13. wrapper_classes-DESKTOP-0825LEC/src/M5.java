public class M5
{
	public static void main(String [] args)
	{
		String s1 = "10";
		String s2 = "200";
		//using second constructor that is accepting- 
		//-string as the argument
		//rule: there should be no alphabets,-
		//-special characters in the string
		//boxing from the content of the string object
		Integer obj = new Integer(s1);//boxing
		Integer obj2 = new Integer(s2);
		int i = obj.intValue();//unboxing
		System.out.println(obj);
		System.out.println(obj2);
		int j = obj2.intValue();
		System.out.println(i);
		System.out.println(j);
		System.out.println("done");
	}
}
