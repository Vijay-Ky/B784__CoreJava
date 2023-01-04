class U <X extends Object>
{
}
class Manager13 
{
	public static void main(String[] args) 
	{
		U <Object> u1 = new U<Object>();
		U <Number> u2 = new U<Number>();
		U <Integer> u3 = new U<Integer>();
		U <Double> u4 = new U<Double>();
		U <String> u5 = new U<String>();
		U <Boolean> u6 = new U<Boolean>();

		System.out.println("done");
	}
}
