class Z6
{
	public static void main(String[] args)
	{
		Thread.State states[] = Thread.State.values();
		for(int i = 0; i <  states.length; i++)
		{
			System.out.println(states[i]);
		}
	}
}
/*
1. inside Thread class there is an enum with a name State
2. we get the lifecycle states of every thread
 The compiler automatically adds some special methods when it creates an enum. For example, they have a static values method that returns an array containing all of the values of the enum in the order they are declared. This method is commonly used in combination with the for-each construct to iterate over the values of an enum type.

Enum.valueOf class
(The special implicit values method is mentioned in description of valueOf method)
All the constants of an enum type can be obtained by calling the implicit public static T[] values() method of that type.

*/
