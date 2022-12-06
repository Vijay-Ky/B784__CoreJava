
class K
{
	K()
	{
		super();
		System.out.println("K()");
	}
}

class L extends K 
{
	L()
	{
		super();
		System.out.println("L()");
	}
	public static void main(String[] args) 
	{
		L obj = new L();
	}
}
