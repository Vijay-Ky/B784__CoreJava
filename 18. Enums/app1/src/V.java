class U
{
	enum En
	{
		C1, C2, C3, C4;
	}
}
class V 
{
	public static void main(String[] args) 
	{
		U.En e1 = U.En.C4;
		U.En e2 = U.En.C2;
		System.out.println(e1);
		System.out.println(e2);
	}
}
