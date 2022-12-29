class G
{
	//must be a valid identifier
	test1, test2, test3;
}
class H 
{
	public static void main(String[] args) 
	{
		G g1 = G.test3;
		System.out.println(g1);
		g1 = G.test2;
		System.out.println(g1);
	}
}
