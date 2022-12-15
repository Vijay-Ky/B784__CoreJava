class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		A a2 = new A(90);
		System.out.println("a1: " + a1.hashCode());
		System.out.println("a2: " + a2.hashCode());
		A a3 = a1;
		System.out.println("a3: " + a3.hashCode());

	}
}
/*
a1 and a3
reference are pointing to the same object. a1 and a3 hashcode
are same. here hashcode is not generating based on the i value.
a1 and a2 hashcode are different but a1 and a2 i value is same.
hashcode method returning the memory address in the form of a
integer. hashcode method return type is int, it is returning
integer representation of memory address. hashcode doesnt care 
about the content of the object and i value. a1.i is same as
a2.i but we are getting different memory address.a1 and a3 are
pointing to same object thats why same memory address.
*/
