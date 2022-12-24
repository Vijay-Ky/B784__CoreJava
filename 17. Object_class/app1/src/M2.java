//program to print all the methods inside Object class

import java.lang.reflect.Method;
class M2
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		int count = 0;
//Returns:the Class object for the class with the specified name.
		Class c1 = Class.forName("java.lang.Object");
		
		Method[] m = c1.getDeclaredMethods();

		for(Method m1 : m)
		{
			count++;
			System.out.println(m1.getName());
		}

		System.out.println("The number of methods: " + count);
	}

}
