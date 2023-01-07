import java.lang.reflect.Method;
class E 
{
	public static void main(String[] args) throws Exception
	{
		int count = 0;

		Class c1 = Class.forName("java.lang.String");//76
		//Class c1 = Class.forName("java.lang.StringBuffer");//93
		//Class c1 = Class.forName("java.lang.StringBuilder");// 93
		
		Method[] methods = c1.getMethods();

		for(Method method : methods)
		{
			count++;
			System.out.println(method);
		}

		System.out.println("total number of methods: " + count);
	}
}
