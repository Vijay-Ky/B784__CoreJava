import java.lang.reflect.Method;
class P 
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("Month");
		Method[] m1 = c1.getDeclaredMethods();

		for(Method m2 : m1)
		{
			System.out.println(m2);
		}
	}
}
