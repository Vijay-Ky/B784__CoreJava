import java.lang.reflect.Method;
class E
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
		return "hello";
	}
}
class M4
{
	public static void main(String[] args) 
	{
		Object a1 = new E();
		//String s1 = "hello";
		//Integer i1 = 200;
		info(a1);
		//System.out.println("****************************");
		//info(s1);
		//System.out.println("****************************");
		//info(obj);
	}
	static void info(Object obj)
	{
		Class c1 = obj.getClass();
		Method[] methods = c1.getDeclaredMethods();//c1.getMethods();
		for(Method method : methods)
		{
			System.out.println(method.getName() + "::" + method.getReturnType());
		}
	}
}
/*
1. There are several getter methods in the Class and we used few methods.
   depending on our requirement we can choose which getter method is suitable.
*/
