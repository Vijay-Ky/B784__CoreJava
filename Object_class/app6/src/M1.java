//reflection api
class A 
{
	int param1;
	String firstName;
}
class M1
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		Class c1 = a1.getClass();
		System.out.println(c1.getName());
	}
}
/*

java.lang
----------
1. Object
2. Class 

class Object
{
	//statements
}

class Class
{
	//statements
}

1. for class Class object will be created while 
   calling getClass() method of object class.
2. Object class members are available in every object.
3. Among all the members of Object class there is a getClass() method also.
4. while calling getClass() method it returns an object to the particular class.
   Inside this class there are several getter methods. Through this getter methods we
   can identify what are the attributes, what are the methods and what is the class name,
   Constructors, access levels like several getter methods are there.
5. Depending on the requirement we can identify which getter method
   we require. to know the schema of a class, to which object is
   created just call getClass() method. it returns an object to the
   Class inside the class several getter methods are available. To
   know every information about a class to which an object is created.
6. Reflection API – 
   generally class to object. Now object to class.
   Reflecting class information through an object. 
7. In any general object there is a getClass() method and you will be getting
   Class object. That object contains several getter methods.
8. By using those getter methods we can find out every information about
   object which class is defined.
9. we are getting a detailed output. assume somehow we got an
   object, just call getClass() method. we will be getting a Class
   object. That Class object containing every information about a
   class to which object is created.
*/