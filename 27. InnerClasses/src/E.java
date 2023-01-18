class E
{
	class F
	{
	}
	static class G
	{
	}

	public static void main(String[] args) 
	{
		E.F f1 = new E().new F();
		G g1 = new E.G();
		System.out.println("done");
	}
}
