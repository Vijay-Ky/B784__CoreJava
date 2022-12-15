class I
{
	int x;//primitive
	String s1;//String type

	public boolean equals(Object obj)
	{
		//in string class already equals method got overrided to check the content
		return (obj instanceof I) && (x == ((I)obj).x) && 
			(s1.equals(((I)obj).s1));
	}
}
class M26 
{
	public static void main(String[] args) 
	{
		I i1 = new I();
		i1.x = 10;
		i1.s1 = "hello";

		I i2 = new I();
		i2.x = 10;
		i2.s1 = "hello";

		//if any one attribute changes returns false
		System.out.println(i1.equals(i2));

		I i3 = new I();
		//in this case i3.x values is 0 i3.s1 value is null
		System.out.println(i3.equals(i1));

		//s1 is null
		I i4 = new I();
		i4.x = 10;
		//i4.s1 is null from a null calling equals method
		  //we get NullPointerException
		System.out.println(i4.equals(i1));

	}
}
/*
- initialy checking whether obj is current class type or
not. this.x comparing with argument.x and this.s1 comparing with
argument.s1. inside string class equals method already got
overrided to check the content, so this.s1 is a string and
argument.s1 is also a string. If any attribute is changed we get 
the false.

-while creating an object
to i3 initialy x value is 0, s1 value null we tried to call
equals method on null, so in this case we will be getting the 
null pointer exception
*/
