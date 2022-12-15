class L
{
	int i;
}
class M12
{
	public static void main(String[] args) 
	{
		L l1 = new L();
		l1.i = 10;

		L l2 = new L();
		l2.i = 10;

		System.out.println(l1 == l2);
		System.out.println(l1.equals(l2));
		System.out.println(l1.i == l2.i);

		L l3 = l1;
		System.out.println(l1 == l3);
		System.out.println(l1.equals(l3));
		System.out.println(l1.i == l3.i);
	}
}
