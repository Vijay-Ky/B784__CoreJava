import java.lang.reflect.Method;
class A  
{
	void test1()
	{
	}

	int test2()
	{
		return 200;
	}

	String test3()
	{
		return "abc";
	}

	public Object clone()
	{  
		try
		{  
			return super.clone();  
		}
		catch(Exception e)
		{ 
			return null; 
		}
	}
	
	public void finalize()
	{
		System.out.println("FROM FINALIZE");
	}
}
class M4
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		String s1 = "hello";
		Integer i = 200;
		
		Class c1 = a1.getClass();

		Method[] methods = c1.getDeclaredMethods();

		for(Method method : methods)
		{
			System.out.println(method.getName() + "::" +
				method.getReturnType());
		}
	}
}
