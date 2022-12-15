//equals method
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
