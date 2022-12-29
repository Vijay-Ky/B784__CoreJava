import java.lang.reflect.Method;
class Q
{
	public static void main(String[] args) throws Exception
	{
		int count = 0;
		Class c1 = Class.forName("R");
		//Method[] m1 = c1.getMethods();
		Method[] m1 = c1.getDeclaredMethods();

		for(Method m2 : m1)
		{
			count++;
			System.out.println(m2);
		}
		
		System.out.println("Number of available methods is:" + count);
	}
}
