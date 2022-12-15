import java.lang.reflect.Method;
class N
{
	
	/*N(int i)
	{
		System.out.println("N()");
	}*/
	
	
	N()
	{
		System.out.println("N()");
	}

	int test4()
	{
		System.out.println("from test4");
		return 1111;
	}
}
class M13
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("N");
		Object obj = c1.newInstance();	
		Method m4 = c1.getDeclaredMethod("test4");
		Object value = m4.invoke(obj);
		System.out.println(value);
		System.out.println();
	}
}
/*
1. reflection api demands no arguments constructor, if at
   all we want to use newinstance method. newinstance method is
   always using no argument constructor to create an object to
   specified class.
2. we are using reflection api to create an object to N.
   We are supplying class name in the form of a string.
   if it is so, N class should be having no arg constructor.
   Reflection api always uses no argument constructor internaly.
   We are not creating an object, we are calling newinstace method. in
   the body of the new instance method it is using no argument
   constructor. If at all somehow no argument constructor not there
   we will be getting instantiation exception. 
3. explicitly we given the no arg constructor.
*/