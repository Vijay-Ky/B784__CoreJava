class K
{
	int i;
}
class M9
{
	public static void main(String[] args)
	{
		K k1 = new K();
		k1.i = 10;

		K k2 = new K();
		k2.i = 10;

		System.out.println(k1 == k2);
		System.out.println(k1.equals(k2));

		K k3 = k1;

		System.out.println(k3 == k1);
		System.out.println(k3.equals(k1));
	}
}
/* 
1. equals method used to check equality of two objects.
2. if our class doesnt contain equals method then object class equals method will
   be executed.
3. by default object class equals method compares the object reference not the 
   content of the objects.
4. if you are comparing two references by using == operator it will check whether
   these two references are pointing to the same object or not and will return the
   boolean result.
*/